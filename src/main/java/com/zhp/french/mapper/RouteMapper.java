package com.zhp.french.mapper;

import com.zhp.french.domain.Route;
import com.zhp.french.domain.RouteDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RouteMapper {
    Route mapToRoute(RouteDto dto);

    RouteDto mapToRouteDto(Route saved);

    List<RouteDto> mapToRouteDtoList(List<Route> all);
}
