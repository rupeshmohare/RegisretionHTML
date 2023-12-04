package com.example.html.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.html.entity.User;


@Repository
public interface UserRepo extends JpaRepository<User, String> {

}
