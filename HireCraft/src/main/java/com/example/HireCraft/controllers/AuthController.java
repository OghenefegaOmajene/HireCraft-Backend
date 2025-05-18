package com.example.HireCraft.controllers;

import com.example.HireCraft.dtos.requests.ForgotPasswordRequest;
import com.example.HireCraft.dtos.requests.LoginRequest;
import com.example.HireCraft.dtos.requests.RegisterRequest;
import com.example.HireCraft.dtos.requests.ResetPasswordRequest;
import com.example.HireCraft.dtos.response.ForgotPasswordResponse;
import com.example.HireCraft.dtos.response.LoginResponse;
import com.example.HireCraft.dtos.response.RegisterResponse;
import com.example.HireCraft.dtos.response.ResetPasswordResponse;
import com.example.HireCraft.services.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import stringcodeltd.com.SecureTasker.dtos.requests.LoginRequest;
//import stringcodeltd.com.SecureTasker.dtos.requests.RegisterRequest;
//import stringcodeltd.com.SecureTasker.dtos.requests.ResetPasswordRequest;
//import stringcodeltd.com.SecureTasker.dtos.response.ForgotPasswordResponse;
//import stringcodeltd.com.SecureTasker.dtos.response.LoginResponse;
//import stringcodeltd.com.SecureTasker.dtos.response.RegisterResponse;
//import stringcodeltd.com.SecureTasker.dtos.response.ResetPasswordResponse;
//import stringcodeltd.com.SecureTasker.services.AuthService;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@Valid @RequestBody RegisterRequest request) {
        RegisterResponse response = authService.register(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(
            @Valid @RequestBody LoginRequest request) {
        LoginResponse response = authService.login(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/forgot-password")
    public ResponseEntity<ForgotPasswordResponse> forgotPassword(
            @Valid @RequestBody ForgotPasswordRequest request) {
        return ResponseEntity.ok(authService.forgotPassword(request));
    }

    @PostMapping("/reset-password")
    public ResponseEntity<ResetPasswordResponse> resetPassword(
            @Valid @RequestBody ResetPasswordRequest request) {
        return ResponseEntity.ok(authService.resetPassword(request));
    }
}
