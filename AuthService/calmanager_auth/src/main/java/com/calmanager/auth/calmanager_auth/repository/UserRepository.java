package com.calmanager.auth.calmanager_auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calmanager.auth.calmanager_auth.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
