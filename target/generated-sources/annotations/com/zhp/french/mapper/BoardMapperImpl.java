package com.zhp.french.mapper;

import com.zhp.french.domain.Board;
import com.zhp.french.domain.BoardDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-05T14:55:40+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
@Component
public class BoardMapperImpl implements BoardMapper {

    @Override
    public List<BoardDto> mapToBoardDtoList(List<Board> list) {
        if ( list == null ) {
            return null;
        }

        List<BoardDto> list1 = new ArrayList<BoardDto>( list.size() );
        for ( Board board : list ) {
            list1.add( mapToBoardDto( board ) );
        }

        return list1;
    }

    @Override
    public BoardDto mapToBoardDto(Board board) {
        if ( board == null ) {
            return null;
        }

        BoardDto boardDto = new BoardDto();

        return boardDto;
    }

    @Override
    public Board mapToBoard(BoardDto dto) {
        if ( dto == null ) {
            return null;
        }

        Board board = new Board();

        return board;
    }
}
