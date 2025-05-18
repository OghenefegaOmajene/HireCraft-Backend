package com.example.HireCraft.services;

import stringcodeltd.com.SecureTasker.dtos.requests.ForgotPasswordRequest;
import stringcodeltd.com.SecureTasker.dtos.requests.LoginRequest;
import stringcodeltd.com.SecureTasker.dtos.requests.RegisterRequest;
import stringcodeltd.com.SecureTasker.dtos.requests.ResetPasswordRequest;
import stringcodeltd.com.SecureTasker.dtos.response.ForgotPasswordResponse;
import stringcodeltd.com.SecureTasker.dtos.response.LoginResponse;
import stringcodeltd.com.SecureTasker.dtos.response.RegisterResponse;
import stringcodeltd.com.SecureTasker.dtos.response.ResetPasswordResponse;

public interface AuthService {
    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);
    /**
     * Initiate a password reset by sending a one-time code
     * to the user’s email (if it exists).
     */
    ForgotPasswordResponse forgotPassword(ForgotPasswordRequest request);

    /**
     * Complete a password reset by validating the code
     * and setting the new password.
     */
    ResetPasswordResponse resetPassword(ResetPasswordRequest request);

}
