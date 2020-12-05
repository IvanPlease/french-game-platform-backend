package com.zhp.french.facade;

import com.zhp.french.domain.BoardDto;
import com.zhp.french.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BoardFacade {
    private final BoardService service;

    public List<BoardDto> getAll() {
        return service.getAll();
    }

    public BoardDto getById(Long id) {
        return service.getById(id);
    }

    public BoardDto create(BoardDto dto) {
        return service.create(dto);
    }

    public BoardDto update(BoardDto dto) {
        return service.update(dto);
    }

    public void delete(Long id) {
        service.delete(id);
    }
}
