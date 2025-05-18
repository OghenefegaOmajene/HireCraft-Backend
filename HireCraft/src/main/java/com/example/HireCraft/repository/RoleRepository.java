package com.example.HireCraft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stringcodeltd.com.SecureTasker.models.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
