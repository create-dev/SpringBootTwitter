package com.tistory.jimin.twitter.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.tistory.jimin.twitter.dao.UserDao;
import com.tistory.jimin.twitter.model.User;

import org.springframework.stereotype.Repository;

@Repository("user")
public class UserRepository implements UserDao {
  
  private static List<User> DB = new ArrayList<>();

  @Override
  public int insertUser(UUID id, User user) {
    DB.add(new User(id, user.getEmail(), user.getPassword(), user.getNickname(), user.getGrade(), user.getScore(), user.getJoinDate()));
    return 1;
  }

  @Override
  public List<User> selectAllUser() {
    return DB;
  }

  @Override
  public Optional<User> selectUserByID(UUID id) {
    return DB.stream()
             .filter(user -> user.getId().equals(id))
             .findFirst();
  }

  @Override
  public int updateUserById(UUID id, User newUser) {
    return selectUserByID(id)
           .map(user -> {
                int indexOfUserToUpdate = DB.indexOf(user);
                if (indexOfUserToUpdate >= 0) {
                  DB.set(indexOfUserToUpdate, new User(id, user.getEmail(), user.getPassword(), user.getNickname(), user.getGrade(), user.getScore(), user.getJoinDate()));
                  return 1;
                }
                return 0;
           })
           .orElse(0);
  }


  @Override
  public int deleteUserById(UUID id) {
    Optional<User> userMaybe = selectUserByID(id);
    if (userMaybe.isEmpty()) {
      return 0;
    }
    DB.remove(userMaybe.get());
    return 1;
  }
}
