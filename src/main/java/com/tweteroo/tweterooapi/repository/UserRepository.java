package com.tweteroo.tweterooapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.tweterooapi.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
