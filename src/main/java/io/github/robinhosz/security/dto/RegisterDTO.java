package io.github.robinhosz.security.dto;

import io.github.robinhosz.security.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
