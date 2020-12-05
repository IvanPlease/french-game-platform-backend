package com.zhp.french.facade;

import com.zhp.french.domain.RouteDto;
import com.zhp.french.service.RouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class RouteFacade {
    private final RouteService service;

    public List<RouteDto> getAll() {
        return service.getAll();
    }

    public RouteDto getById(Long id) {
        return service.getById(id);
    }

    public RouteDto create(RouteDto dto) {
        return service.create(dto);
    }

    public RouteDto update(RouteDto dto) {
        return service.update(dto);
    }

    public void delete(Long id) {
        service.delete(id);
    }
}
