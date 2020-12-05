package com.zhp.french.mapper;

import com.zhp.french.domain.Board;
import com.zhp.french.domain.BoardDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BoardMapper {
    List<BoardDto> mapToBoardDtoList(List<Board> list);

    BoardDto mapToBoardDto(Board board);

    Board mapToBoard(BoardDto dto);
}
