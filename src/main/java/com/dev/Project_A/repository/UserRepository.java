package com.dev.Project_A.repository;

import com.dev.Project_A.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User,String> {
    boolean existsByUsername(String username);
}
