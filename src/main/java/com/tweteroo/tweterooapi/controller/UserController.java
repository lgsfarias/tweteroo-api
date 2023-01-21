package com.tweteroo.tweterooapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.tweteroo.tweterooapi.dto.UserDTO;
import com.tweteroo.tweterooapi.model.UserModel;
import com.tweteroo.tweterooapi.repository.UserRepository;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/auth/sign-up")
public class UserController {

  @Autowired
  private UserRepository repository;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public String signUp(@RequestBody @Valid UserDTO userDTO) {
    repository.save(new UserModel(userDTO));
    return "OK";
  }

}
