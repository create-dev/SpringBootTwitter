package com.tistory.jimin.twitter.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.tistory.jimin.twitter.dao.UserDao;
import com.tistory.jimin.twitter.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserDao userDao;

  @Autowired
  public UserService(@Qualifier("user") UserDao userdao) {
    this.userDao = userDao;
  }

  public int insertUser(final User user) {
    return userDao.insertUser(user);
  }

  public List<User> selectAllUser() {
    return userDao.selectAllUser();
  }

  public Optional<User> selectUserById(final UUID id) {
    return userDao.selectUserByID(id);
  }

  public int updateUserById(final UUID id, final User newUser) {
    return userDao.updateUserById(id, newUser);
  }

  public int deleteUserById(final UUID id) {
    return userDao.deleteUserById(id);
  }
}
