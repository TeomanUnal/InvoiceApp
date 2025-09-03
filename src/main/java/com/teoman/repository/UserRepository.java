package com.teoman.repository;

import com.teoman.model.User;
import com.teoman.model.UserAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT i FROM User i WHERE i.auth = :auth")
    Optional<User> findByAuth(@Param("auth") UserAuth auth);

}
