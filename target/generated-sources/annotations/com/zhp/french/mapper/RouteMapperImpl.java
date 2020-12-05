package com.zhp.french.mapper;

import com.zhp.french.domain.Route;
import com.zhp.french.domain.RouteDto;
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
public class RouteMapperImpl implements RouteMapper {

    @Override
    public Route mapToRoute(RouteDto dto) {
        if ( dto == null ) {
            return null;
        }

        Route route = new Route();

        return route;
    }

    @Override
    public RouteDto mapToRouteDto(Route saved) {
        if ( saved == null ) {
            return null;
        }

        RouteDto routeDto = new RouteDto();

        return routeDto;
    }

    @Override
    public List<RouteDto> mapToRouteDtoList(List<Route> all) {
        if ( all == null ) {
            return null;
        }

        List<RouteDto> list = new ArrayList<RouteDto>( all.size() );
        for ( Route route : all ) {
            list.add( mapToRouteDto( route ) );
        }

        return list;
    }
}
