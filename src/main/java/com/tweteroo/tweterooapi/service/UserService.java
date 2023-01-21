package com.tweteroo.tweterooapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.tweterooapi.model.UserModel;
import com.tweteroo.tweterooapi.repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository repository;

  public String getAvatarByUsername(String username) {
    List<UserModel> users = repository.findByUsername(username);
    if (!users.isEmpty()) {
      return users.get(0).getAvatar();
    }
    return "";
  }
}
