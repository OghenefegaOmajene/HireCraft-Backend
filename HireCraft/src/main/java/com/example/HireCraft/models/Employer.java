package com.example.HireCraft.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="employers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employer {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_employer",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "employer_id")
    )
    @Builder.Default
    private Set<User> users = new HashSet<>();
}
