package com.example.weddingplanner.application.user.controller.dto;

public record UserResponse(Long id,
                           String email,
                           String firstName,
                           String lastName) {
}
