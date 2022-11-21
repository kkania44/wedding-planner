package com.example.weddingplanner.application.user.controller.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public record CreateUserDto(@Email @NotBlank String email,
                            @NotBlank String firstName,
                            @NotBlank String lastName,
                            String phoneNumber) {
}
