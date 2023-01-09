package com.example.Validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Validation.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
