package com.example.HireCraft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stringcodeltd.com.SecureTasker.models.PasswordResetToken;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {

     // Find a token by the user and code, ordered by newest first.
    Optional<PasswordResetToken> findFirstByUserEmailAndTokenOrderByExpiresAtDesc(
            String email, String token);

   // delete all expired or used tokens for a user.

    void deleteByUserEmailAndExpiresAtBefore(String email, LocalDateTime cutoff);
}
