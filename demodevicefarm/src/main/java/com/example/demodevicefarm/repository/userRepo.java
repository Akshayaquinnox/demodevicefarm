package com.example.demodevicefarm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demodevicefarm.domain.users;


public interface userRepo extends JpaRepository<users,Integer> {

}
