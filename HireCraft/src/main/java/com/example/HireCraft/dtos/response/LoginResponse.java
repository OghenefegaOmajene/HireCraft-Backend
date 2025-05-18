package com.example.HireCraft.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record LoginResponse(
        @JsonProperty("access_token")
        String accessToken,

        @JsonProperty("token_type")
        String tokenType,

        @JsonProperty("expires_in")
        long expiresIn

//        @JsonProperty("expires_at")
//        Instant expiresAt
) { }
