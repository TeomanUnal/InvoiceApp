package com.teoman.repository;

import com.teoman.model.UserAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAuthRepository extends JpaRepository<UserAuth, Long> {

    @Query("SELECT i FROM UserAuth i WHERE i.username = :username")
    Optional<UserAuth> findByUsername(@Param("username") String username);

}
