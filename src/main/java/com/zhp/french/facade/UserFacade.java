package com.zhp.french.facade;

import com.zhp.french.domain.UserDto;
import com.zhp.french.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserFacade {
    private final UserService service;

    public List<UserDto> getAll() {
        return service.getAll();
    }

    public UserDto getById(Long id) {
        return service.getById(id);
    }

    public UserDto create(UserDto dto) {
        return service.create(dto);
    }

    public UserDto update(UserDto dto) {
        return service.update(dto);
    }

    public void delete(Long id) {
        service.delete(id);
    }
}
