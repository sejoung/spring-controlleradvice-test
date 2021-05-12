package io.github.sejoung.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
  public void test() {
    throw new RuntimeException("에러");
  }
}
