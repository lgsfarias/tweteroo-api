package com.tweteroo.tweterooapi.dto;

import jakarta.validation.constraints.NotBlank;

public record TweetDTO(
                @NotBlank(message = "Text is required") String text) {
}