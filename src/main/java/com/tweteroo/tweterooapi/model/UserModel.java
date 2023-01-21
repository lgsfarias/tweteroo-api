package com.tweteroo.tweterooapi.model;

import com.tweteroo.tweterooapi.dto.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class UserModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false, length = 50)
  private String username;

  @Column(nullable = false, length = 200)
  private String avatar;

  public UserModel(UserDTO userDTO) {
    this.username = userDTO.username();
    this.avatar = userDTO.avatar();
  }
}
