package com.zhp.french.facade;

import com.zhp.french.domain.QuestDto;
import com.zhp.french.service.QuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class QuestFacade {
    private final QuestService service;

    public List<QuestDto> getAll() {
        return service.getAll();
    }

    public QuestDto getById(Long id) {
        return service.getById(id);
    }

    public QuestDto create(QuestDto dto) {
        return service.create(dto);
    }

    public QuestDto update(QuestDto dto) {
        return service.update(dto);
    }

    public void delete(Long id) {
        service.delete(id);
    }
}
