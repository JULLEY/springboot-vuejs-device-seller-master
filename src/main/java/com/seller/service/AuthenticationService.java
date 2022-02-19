package com.seller.service;

import com.seller.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
