package com.example.api.dto;

import com.example.api.entitities.Role;

import java.util.List;

public record RecoveryUserDto(

        Long id,

        String email,

        List<Role> roles
) {
}
