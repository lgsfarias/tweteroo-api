package com.tweteroo.tweterooapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import com.tweteroo.tweterooapi.dto.TweetDTO;
import com.tweteroo.tweterooapi.model.TweetModel;
import com.tweteroo.tweterooapi.repository.TweetRepository;

@Service
public class TweetService {

  @Autowired
  private TweetRepository repository;

  @Autowired
  private UserService userService;

  public Page<TweetModel> listWithPagination(int page) {
    int size = 10;
    Pageable pageable = PageRequest.of(page, size);
    return repository.findAll(pageable);
  }

  public String newTweet(TweetDTO tweetDto, String username) {
    String avatar = userService.getAvatarByUsername(username);
    repository.save(new TweetModel(tweetDto, username, avatar));
    return "OK";
  }
}
