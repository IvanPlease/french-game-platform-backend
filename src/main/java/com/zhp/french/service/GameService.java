package com.zhp.french.service;

import com.zhp.french.domain.Game;
import com.zhp.french.domain.GameDto;
import com.zhp.french.exceptions.GameDontExistsException;
import com.zhp.french.exceptions.GameExistsException;
import com.zhp.french.exceptions.GameNotFoundException;
import com.zhp.french.mapper.GameMapper;
import com.zhp.french.service.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class GameService {
    private final GameRepository repository;
    private final GameMapper mapper;

    public List<GameDto> getAll() {
        return mapper.mapToGameDtoList(repository.findAll());
    }

    public GameDto getById(Long id) {
        try {
            Game fetched = repository.findById(id).orElseThrow(GameNotFoundException::new);
            return mapper.mapToGameDto(fetched);
        } catch (GameNotFoundException e) {
            log.error(e.getMessage());
        }
        return GameDto.builder().build();
    }

    public GameDto create(GameDto dto) {
        isGameNotExisting(dto.getId());
        Game mapped = mapper.mapToGame(dto);
        Game saved = repository.save(mapped);
        return mapper.mapToGameDto(saved);
    }

    public GameDto update(GameDto dto) {
        isGameExisting(dto.getId());
        Game mapped = mapper.mapToGame(dto);
        Game saved = repository.save(mapped);
        return mapper.mapToGameDto(saved);
    }

    public void delete(Long id) {
        isGameNotExisting(id);
        repository.deleteById(id);
    }

    private void isGameNotExisting(Long id) {
        try {
            if (!repository.existsById(id)) {
                throw new GameDontExistsException();
            }
        } catch (GameDontExistsException e) {
            log.error(e.getMessage());
        }
    }

    private void isGameExisting(Long id) {
        try {
            if (repository.existsById(id)) {
                throw new GameExistsException();
            }
        } catch (GameExistsException e) {
            log.error(e.getMessage());
        }
    }
}
