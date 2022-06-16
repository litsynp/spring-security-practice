package com.litsynp.springsec.jwt.domain.auth.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class TokenResponseDto {

    @Builder.Default
    private String tokenType = "Bearer";
    private String accessToken;
    private String refreshToken;
    private AuthMemberResponseDto member;

    @Builder
    public TokenResponseDto(String tokenType, String accessToken, String refreshToken,
            AuthMemberResponseDto member) {
        this.tokenType = "Bearer";
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.member = member;
    }
}
