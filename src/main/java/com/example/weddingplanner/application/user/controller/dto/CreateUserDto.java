package com.example.weddingplanner.application.user.controller.dto;

public record CreateUserDto(String email,
                            String firstName,
                            String lastName,
                            String phoneNumber) {
}
