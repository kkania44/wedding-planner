package com.example.weddingplanner.application.user.service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Builder
@Getter
class User {

    Long id;
    String email;
    String firstName;
    String lastName;
    String phoneNumber;
    UUID keycloakId;

}
