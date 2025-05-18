package com.example.HireCraft.services;

import org.springframework.web.multipart.MultipartFile;
import stringcodeltd.com.SecureTasker.dtos.requests.ProfilePatchRequest;
import stringcodeltd.com.SecureTasker.dtos.requests.UserUpdateRequest;
import stringcodeltd.com.SecureTasker.dtos.response.UserDetailResponse;
import stringcodeltd.com.SecureTasker.dtos.response.UserListResponse;

import java.util.List;

public interface UserService {

    List<UserListResponse> getAllUsers();
    UserDetailResponse getUserById(Long id);
    UserDetailResponse updateUser(Long id, UserUpdateRequest request);

    void deleteUser(Long id);
    UserDetailResponse getUserByEmail(String email);
    UserDetailResponse updateUserProfile(String email, ProfilePatchRequest request);
    String updateProfilePicture(String email, MultipartFile file);

}
