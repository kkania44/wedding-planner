package com.example.weddingplanner.application.user.config;

import com.example.weddingplanner.application.user.controller.dto.CreateUserDto;
import com.example.weddingplanner.application.user.controller.dto.UserResponse;
import com.example.weddingplanner.application.user.repository.model.UserEntity;
import com.example.weddingplanner.application.user.service.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import static org.mapstruct.ReportingPolicy.IGNORE;

@Mapper(componentModel = "spring", unmappedSourcePolicy = IGNORE, unmappedTargetPolicy = IGNORE)
public interface UserMapper {

    UserEntity userDomainToEntity(User user);

    User userEntityToDomain(UserEntity userEntity);

    User userDtoToDomain(CreateUserDto userDto);

    UserResponse userDomainToResponse(User user);

}
