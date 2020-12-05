package com.zhp.french.controller;

import com.zhp.french.domain.GameDto;
import com.zhp.french.facade.GameFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/game")
@RequiredArgsConstructor
public class GameController {
    private final GameFacade facade;

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<GameDto> getAllGame() {
        return facade.getAll();
    }

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public GameDto getGameById(@PathVariable Long id) {
        return facade.getById(id);
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public GameDto createGame(@RequestBody GameDto dto) {
        return facade.create(dto);
    }

    @PutMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public GameDto updateGame(@RequestBody GameDto dto) {
        return facade.update(dto);
    }

    @DeleteMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public void deleteGame(@PathVariable Long id) {
        facade.delete(id);
    }

}
