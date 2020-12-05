package com.zhp.french.mapper;

import com.zhp.french.domain.Game;
import com.zhp.french.domain.GameDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GameMapper {
    Game mapToGame(GameDto boardDto);
    GameDto mapToGameDto(Game board);
    List<GameDto> mapToGameDtoList(List<Game> all);
}
