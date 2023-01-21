package com.tweteroo.tweterooapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.tweteroo.tweterooapi.dto.TweetDTO;
import com.tweteroo.tweterooapi.model.TweetModel;
import com.tweteroo.tweterooapi.service.TweetService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/tweets")
public class TweetController {

  @Autowired
  private TweetService service;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public Page<TweetModel> listWithPagination(@RequestParam("page") int page) {
    return service.listWithPagination(page);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public String newTweet(@RequestBody TweetDTO tweetDTO, @RequestHeader("User") String username) {
    service.newTweet(tweetDTO, username);
    return "OK";
  }
}
