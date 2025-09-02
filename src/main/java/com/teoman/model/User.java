package com.teoman.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "_user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "auth_id", unique = true, nullable = false)
    private UserAuth auth;

    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;
}
