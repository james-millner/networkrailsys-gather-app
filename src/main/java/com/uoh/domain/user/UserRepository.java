package com.uoh.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Ella Knight on 12/02/2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    List<User> findByEnabled(Boolean enabled);

    List<User> findAll();
}
