package com.tweteroo.tweterooapi.dto;

import jakarta.validation.constraints.NotBlank;

public record UserDTO(
    @NotBlank(message = "Username is required") String username,
    @NotBlank(message = "Avatar is required") String avatar) {
}
