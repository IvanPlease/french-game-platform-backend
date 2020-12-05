package com.zhp.french.controller;

import com.zhp.french.domain.QuestDto;
import com.zhp.french.facade.QuestFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/quest")
@RequiredArgsConstructor
public class QuestController {
    private final QuestFacade facade;

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<QuestDto> getAllQuest() {
        return facade.getAll();
    }

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public QuestDto getQuestById(@PathVariable Long id) {
        return facade.getById(id);
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public QuestDto createQuest(@RequestBody QuestDto dto) {
        return facade.create(dto);
    }

    @PutMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public QuestDto updateQuest(@RequestBody QuestDto dto) {
        return facade.update(dto);
    }

    @DeleteMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public void deleteQuest(@PathVariable Long id) {
        facade.delete(id);
    }

}
