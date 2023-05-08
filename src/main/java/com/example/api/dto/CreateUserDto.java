package com.example.api.dto;

import com.example.api.enums.RoleName;

public record CreateUserDto(
        String email,
        String password,
        RoleName role
) {
}
