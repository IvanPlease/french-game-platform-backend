package com.zhp.french.controller;

import com.zhp.french.domain.RouteDto;
import com.zhp.french.facade.RouteFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/route")
@RequiredArgsConstructor
public class RouteController {
    private final RouteFacade facade;

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<RouteDto> getAllRoute() {
        return facade.getAll();
    }

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public RouteDto getRouteById(@PathVariable Long id) {
        return facade.getById(id);
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public RouteDto createRoute(@RequestBody RouteDto dto) {
        return facade.create(dto);
    }

    @PutMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public RouteDto updateRoute(@RequestBody RouteDto dto) {
        return facade.update(dto);
    }

    @DeleteMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public void deleteRoute(@PathVariable Long id) {
        facade.delete(id);
    }

}
