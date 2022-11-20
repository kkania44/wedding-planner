package com.example.weddingplanner.application.user.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

import static javax.persistence.GenerationType.IDENTITY;

@Table(name = "users")
@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;
    @NotNull
    String email;
    @NotNull
    String firstName;
    @NotNull
    String lastName;
    @Column(name = "phone_number", length = 12)
    String phoneNumber;
    UUID keycloakId;
    @Column(name = "is_active")
    boolean active;

}
