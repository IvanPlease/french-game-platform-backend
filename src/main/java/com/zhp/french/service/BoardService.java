package com.zhp.french.service;

import com.zhp.french.domain.Board;
import com.zhp.french.domain.BoardDto;
import com.zhp.french.exceptions.BoardDontExistsException;
import com.zhp.french.exceptions.BoardExistsException;
import com.zhp.french.exceptions.BoardNotFoundException;
import com.zhp.french.mapper.BoardMapper;
import com.zhp.french.service.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class BoardService {
    private final BoardRepository repository;
    private final BoardMapper mapper;

    public List<BoardDto> getAll() {
        return mapper.mapToBoardDtoList(repository.findAll());
    }

    public BoardDto getById(Long id) {
        try {
            Board fetched = repository.findById(id).orElseThrow(BoardNotFoundException::new);
            return mapper.mapToBoardDto(fetched);
        } catch (BoardNotFoundException e) {
            log.error(e.getMessage());
        }
        return BoardDto.builder().build();
    }

    public BoardDto create(BoardDto dto) {
        isBoardNotExisting(dto.getId());
        Board mapped = mapper.mapToBoard(dto);
        Board saved = repository.save(mapped);
        return mapper.mapToBoardDto(saved);
    }

    public BoardDto update(BoardDto dto) {
        isBoardExisting(dto.getId());
        Board mapped = mapper.mapToBoard(dto);
        Board saved = repository.save(mapped);
        return mapper.mapToBoardDto(saved);
    }

    public void delete(Long id) {
        isBoardNotExisting(id);
        repository.deleteById(id);
    }

    private void isBoardNotExisting(Long id) {
        try {
            if (!repository.existsById(id)) {
                throw new BoardDontExistsException();
            }
        } catch (BoardDontExistsException e) {
            log.error(e.getMessage());
        }
    }

    private void isBoardExisting(Long id) {
        try {
            if (repository.existsById(id)) {
                throw new BoardExistsException();
            }
        } catch (BoardExistsException e) {
            log.error(e.getMessage());
        }
    }
}
