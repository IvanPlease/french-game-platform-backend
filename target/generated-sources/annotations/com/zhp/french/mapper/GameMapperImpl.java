package com.zhp.french.mapper;

import com.zhp.french.domain.Game;
import com.zhp.french.domain.GameDto;
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
public class GameMapperImpl implements GameMapper {

    @Override
    public List<GameDto> mapToGameDtoList(List<Game> all) {
        if ( all == null ) {
            return null;
        }

        List<GameDto> list = new ArrayList<GameDto>( all.size() );
        for ( Game game : all ) {
            list.add( mapToGameDto( game ) );
        }

        return list;
    }

    @Override
    public GameDto mapToGameDto(Game board) {
        if ( board == null ) {
            return null;
        }

        GameDto gameDto = new GameDto();

        return gameDto;
    }

    @Override
    public Game mapToGame(GameDto boardDto) {
        if ( boardDto == null ) {
            return null;
        }

        Game game = new Game();

        return game;
    }
}
