package com.zhp.french.controller;

import com.zhp.french.domain.BoardDto;
import com.zhp.french.facade.BoardFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardFacade facade;

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<BoardDto> getAllBoard() {
        return facade.getAll();
    }

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public BoardDto getBoardById(@PathVariable Long id) {
        return facade.getById(id);
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public BoardDto createBoard(@RequestBody BoardDto dto) {
        return facade.create(dto);
    }

    @PutMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public BoardDto updateBoard(@RequestBody BoardDto dto) {
        return facade.update(dto);
    }

    @DeleteMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public void deleteBoard(@PathVariable Long id) {
        facade.delete(id);
    }

}
