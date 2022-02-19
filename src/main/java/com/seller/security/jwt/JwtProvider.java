package com.seller.security.jwt;

import com.seller.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface JwtProvider {
    String generateToken(UserPrincipal auth);

    Authentication getAutentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
