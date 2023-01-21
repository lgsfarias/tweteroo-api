package com.tweteroo.tweterooapi.dto;

import jakarta.validation.constraints.NotBlank;

public record TweetDTO(

    @NotBlank(message = "Username is required") String username,

    @NotBlank(message = "Avatar is required") String avatar,

    @NotBlank(message = "Text is required") String text) {
}