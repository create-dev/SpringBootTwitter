package com.tistory.jimin.twitter.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.tistory.jimin.twitter.model.User;

public interface UserDao {

  int insertUser(UUID id, User user);

  default int insertUser(User user) {
    UUID id = UUID.randomUUID();
    return insertUser(id, user);
  }

  List<User> selectAllUser();

  Optional<User> selectUserByID(UUID id);

  int updateUserById(UUID id, User newUser);

  int deleteUserById(UUID id);
}