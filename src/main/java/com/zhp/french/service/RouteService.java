package com.zhp.french.service;

import com.zhp.french.domain.Route;
import com.zhp.french.domain.RouteDto;
import com.zhp.french.domain.Route;
import com.zhp.french.domain.RouteDto;
import com.zhp.french.exceptions.RouteDontExistsException;
import com.zhp.french.exceptions.RouteExistsException;
import com.zhp.french.exceptions.RouteNotFoundException;
import com.zhp.french.mapper.RouteMapper;
import com.zhp.french.service.repository.RouteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class RouteService {
    private final RouteRepository repository;
    private final RouteMapper mapper;

    public List<RouteDto> getAll() {
        return mapper.mapToRouteDtoList(repository.findAll());
    }

    public RouteDto getById(Long id) {
        try {
            Route fetched = repository.findById(id).orElseThrow(RouteNotFoundException::new);
            return mapper.mapToRouteDto(fetched);
        } catch (RouteNotFoundException e) {
            log.error(e.getMessage());
        }
        return RouteDto.builder().build();
    }

    public RouteDto create(RouteDto dto) {
        if(dto.getId() != null){
            isRouteNotExisting(dto.getId());
        }
        Route mapped = mapper.mapToRoute(dto);
        Route saved = repository.save(mapped);
        return mapper.mapToRouteDto(saved);
    }

    public RouteDto update(RouteDto dto) {
        if(dto.getId() != null){
            isRouteNotExisting(dto.getId());
        }
        Route mapped = mapper.mapToRoute(dto);
        Route saved = repository.save(mapped);
        return mapper.mapToRouteDto(saved);
    }

    public void delete(Long id) {
        if(id != null){
            isRouteNotExisting(id);
            repository.deleteById(id);
        }
    }

    private void isRouteNotExisting(Long id) {
        try {
            if (!repository.existsById(id)) {
                throw new RouteDontExistsException();
            }
        } catch (RouteDontExistsException e) {
            log.error(e.getMessage());
        }
    }

    private void isRouteExisting(Long id) {
        try {
            if (repository.existsById(id)) {
                throw new RouteExistsException();
            }
        } catch (RouteExistsException e) {
            log.error(e.getMessage());
        }
    }
}
