package com.zhp.french.facade;

import com.zhp.french.domain.GameDto;
import com.zhp.french.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GameFacade {
    private final GameService service;

    public List<GameDto> getAll() {
        return service.getAll();
    }

    public GameDto getById(Long id) {
        return service.getById(id);
    }

    public GameDto create(GameDto dto) {
        return service.create(dto);
    }

    public GameDto update(GameDto dto) {
        return service.update(dto);
    }

    public void delete(Long id) {
        service.delete(id);
    }
}
