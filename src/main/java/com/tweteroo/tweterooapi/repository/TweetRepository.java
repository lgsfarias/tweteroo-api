package com.tweteroo.tweterooapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.tweterooapi.model.TweetModel;

public interface TweetRepository extends JpaRepository<TweetModel, Long> {

}
