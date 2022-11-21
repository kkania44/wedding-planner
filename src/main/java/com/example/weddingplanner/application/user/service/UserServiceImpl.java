package com.example.weddingplanner.application.user.service;

import com.example.weddingplanner.application.user.config.UserMapper;
import com.example.weddingplanner.application.user.repository.UserRepository;
import com.example.weddingplanner.application.user.repository.model.UserEntity;
import com.example.weddingplanner.application.user.service.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public User create(User user) {
        log.info("Creating user");
        UserEntity userEntity = userMapper.userDomainToEntity(user);
        userRepository.save(userEntity);
        log.debug("User created with id: {}", userEntity.getId());
        return userMapper.userEntityToDomain(userEntity);
    }

}
