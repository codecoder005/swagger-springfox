package com.lmig.controller;

import com.lmig.dto.UserDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@CrossOrigin
@RequestMapping("/users/v1")
public class UserController {
    private final ConcurrentHashMap<Long, UserDto> data = new ConcurrentHashMap<>();

    @ApiOperation(
            value = "Get user by user id",
            notes = "Get User object by providing user id",
            response = UserDto.class
    )
    @GetMapping(
            value = "/{id}",
            produces = {"application/json"}
    )
    public UserDto getUser(
            @ApiParam(value = "provide user id to get the UserDto object from database", required = true)
            @PathVariable(name = "id") Long id) {
        return data.get(id);
    }

    @GetMapping(
            produces = {"application/json", "application/xml"}
    )
    public Collection<UserDto> getAllUsers() {
        return data.values();
    }

    @PostMapping(
            consumes = {"application/json"},
            produces = {"application/json", "application/xml"}
    )
    public UserDto createUser(@RequestBody UserDto user) {
        data.put(user.getId(), user);
        return user;
    }
}
