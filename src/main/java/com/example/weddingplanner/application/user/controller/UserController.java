package com.example.weddingplanner.application.user.controller;

import com.example.weddingplanner.application.user.config.UserMapper;
import com.example.weddingplanner.application.user.controller.dto.CreateUserDto;
import com.example.weddingplanner.application.user.controller.dto.UserResponse;
import com.example.weddingplanner.application.user.service.UserService;
import com.example.weddingplanner.application.user.service.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/user")
class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping
    UserResponse create(@RequestBody CreateUserDto userDto) {
        User user = userMapper.userDtoToDomain(userDto);
        User saveUser = userService.create(user);
        return userMapper.userDomainToResponse(saveUser);
    }

}
