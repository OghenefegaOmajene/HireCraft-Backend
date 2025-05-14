package com.example.HireCraft.services;

import com.example.HireCraft.dtos.requests.LoginRequest;
import com.example.HireCraft.dtos.requests.SignupRequest;
import com.example.HireCraft.dtos.response.LoginResponse;
import com.example.HireCraft.dtos.response.SignupResponse;

public interface AuthService {
    SignupResponse signup(SignupRequest request);

    LoginResponse login(LoginRequest request);
}
