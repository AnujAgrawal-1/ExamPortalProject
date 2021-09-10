package com.example.examportalproject.repo;

import com.example.examportalproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface
UserRepository extends JpaRepository<User,Long> {

}
