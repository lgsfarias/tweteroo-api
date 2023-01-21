package com.tweteroo.tweterooapi.dto;

import jakarta.validation.constraints.NotBlank;

public record TweetDTO(

        @NotBlank(message = "Username is required") String username,

        @NotBlank(message = "Text is required") String text) {
}