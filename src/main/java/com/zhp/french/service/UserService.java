package com.zhp.french.service;

import com.zhp.french.domain.User;
import com.zhp.french.domain.UserDto;
import com.zhp.french.exceptions.UserDontExistsException;
import com.zhp.french.exceptions.UserExistsException;
import com.zhp.french.exceptions.UserNotFoundException;
import com.zhp.french.mapper.UserMapper;
import com.zhp.french.service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserService {
    private final UserRepository repository;
    private final UserMapper mapper;

    public List<UserDto> getAll() {
        return mapper.mapToUserDtoList(repository.findAll());
    }

    public UserDto getById(Long id) {
        try {
            User fetched = repository.findById(id).orElseThrow(UserNotFoundException::new);
            return mapper.mapToUserDto(fetched);
        } catch (UserNotFoundException e) {
            log.error(e.getMessage());
        }
        return UserDto.builder().build();
    }

    public UserDto create(UserDto dto) {
        if(dto.getId() != null){
            isUserNotExisting(dto.getId());
        }
        User mapped = mapper.mapToUser(dto);
        User saved = repository.save(mapped);
        return mapper.mapToUserDto(saved);
    }

    public UserDto update(UserDto dto) {
        if(dto.getId() != null){
            isUserNotExisting(dto.getId());
        }
        User mapped = mapper.mapToUser(dto);
        User saved = repository.save(mapped);
        return mapper.mapToUserDto(saved);
    }

    public void delete(Long id) {
        if(id != null){
            isUserNotExisting(id);
            repository.deleteById(id);
        }
    }

    private void isUserNotExisting(Long id) {
        try {
            if (!repository.existsById(id)) {
                throw new UserDontExistsException();
            }
        } catch (UserDontExistsException e) {
            log.error(e.getMessage());
        }
    }

    private void isUserExisting(Long id) {
        try {
            if (repository.existsById(id)) {
                throw new UserExistsException();
            }
        } catch (UserExistsException e) {
            log.error(e.getMessage());
        }
    }
}
