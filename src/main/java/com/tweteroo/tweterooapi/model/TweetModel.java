package com.tweteroo.tweterooapi.model;

import com.tweteroo.tweterooapi.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "tweets")
public class TweetModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false, length = 50)
  private String username;

  @Column(nullable = false, length = 200)
  private String avatar;

  @Column(nullable = false, length = 280)
  private String text;

  public TweetModel(TweetDTO tweetDTO) {
    this.username = tweetDTO.username();
    this.avatar = tweetDTO.avatar();
    this.text = tweetDTO.text();
  }
}
