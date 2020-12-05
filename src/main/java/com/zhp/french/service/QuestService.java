package com.zhp.french.service;

import com.zhp.french.domain.Quest;
import com.zhp.french.domain.QuestDto;
import com.zhp.french.exceptions.QuestDontExistsException;
import com.zhp.french.exceptions.QuestExistsException;
import com.zhp.french.exceptions.QuestNotFoundException;
import com.zhp.french.mapper.QuestMapper;
import com.zhp.french.service.repository.QuestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class QuestService {
    private final QuestRepository repository;
    private final QuestMapper mapper;

    public List<QuestDto> getAll() {
        return mapper.mapToQuestDtoList(repository.findAll());
    }

    public QuestDto getById(Long id) {
        try {
            Quest fetched = repository.findById(id).orElseThrow(QuestNotFoundException::new);
            return mapper.mapToQuestDto(fetched);
        } catch (QuestNotFoundException e) {
            log.error(e.getMessage());
        }
        return QuestDto.builder().build();
    }

    public QuestDto create(QuestDto dto) {
        isQuestNotExisting(dto.getId());
        Quest mapped = mapper.mapToQuest(dto);
        Quest saved = repository.save(mapped);
        return mapper.mapToQuestDto(saved);
    }

    public QuestDto update(QuestDto dto) {
        isQuestExisting(dto.getId());
        Quest mapped = mapper.mapToQuest(dto);
        Quest saved = repository.save(mapped);
        return mapper.mapToQuestDto(saved);
    }

    public void delete(Long id) {
        isQuestNotExisting(id);
        repository.deleteById(id);
    }

    private void isQuestNotExisting(Long id) {
        try {
            if (!repository.existsById(id)) {
                throw new QuestDontExistsException();
            }
        } catch (QuestDontExistsException e) {
            log.error(e.getMessage());
        }
    }

    private void isQuestExisting(Long id) {
        try {
            if (repository.existsById(id)) {
                throw new QuestExistsException();
            }
        } catch (QuestExistsException e) {
            log.error(e.getMessage());
        }
    }
}
