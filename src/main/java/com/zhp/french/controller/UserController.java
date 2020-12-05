package com.zhp.french.controller;

import com.zhp.french.domain.UserDto;
import com.zhp.french.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserFacade facade;

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<UserDto> getAllUser() {
        return facade.getAll();
    }

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public UserDto getUserById(@PathVariable Long id) {
        return facade.getById(id);
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public UserDto createUser(@RequestBody UserDto dto) {
        return facade.create(dto);
    }

    @PutMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public UserDto updateUser(@RequestBody UserDto dto) {
        return facade.update(dto);
    }

    @DeleteMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public void deleteUser(@PathVariable Long id) {
        facade.delete(id);
    }

}
