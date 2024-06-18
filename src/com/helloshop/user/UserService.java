package com.helloshop.user;

public class UserService {
  void signIn(String userId, String name) {
    User user = new User(userId, name);
  }
}
