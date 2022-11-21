package com.example.weddingplanner.application.user.repository;

import com.example.weddingplanner.application.user.repository.model.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
