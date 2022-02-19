package com.seller.security.jwt;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface JwtProvider {
    Authentication getAutentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
