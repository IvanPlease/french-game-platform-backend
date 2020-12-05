package com.zhp.french.mapper;

import com.zhp.french.domain.Board;
import com.zhp.french.domain.BoardDto;
import com.zhp.french.domain.Quest;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = {GameMapper.class, QuestMapper.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BoardMapper {
    Board mapToBoard(BoardDto dto);
    BoardDto mapToBoardDto(Board board);
    List<BoardDto> mapToBoardDtoList(List<Board> list);
}
