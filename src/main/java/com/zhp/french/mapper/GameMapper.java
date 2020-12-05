package com.zhp.french.mapper;

import com.zhp.french.domain.Game;
import com.zhp.french.domain.GameDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GameMapper {
    List<GameDto> mapToGameDtoList(List<Game> all);

    GameDto mapToGameDto(Game board);

    Game mapToGame(GameDto boardDto);
}
