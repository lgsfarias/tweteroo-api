package com.tweteroo.tweterooapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.tweterooapi.model.TweetModel;

public interface TweetRepository extends JpaRepository<TweetModel, Long> {
  List<TweetModel> findByUsername(String username);
}
