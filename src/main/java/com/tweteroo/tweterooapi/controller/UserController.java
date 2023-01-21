package com.tweteroo.tweterooapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.tweterooapi.dto.UserDTO;
import com.tweteroo.tweterooapi.model.UserModel;
import com.tweteroo.tweterooapi.repository.UserRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sign-up")
public class UserController {

  @Autowired
  private UserRepository repository;

  @PostMapping
  public String signUp(@RequestBody @Valid UserDTO userDTO) {
    repository.save(new UserModel(userDTO));
    return "OK";
  }

}
