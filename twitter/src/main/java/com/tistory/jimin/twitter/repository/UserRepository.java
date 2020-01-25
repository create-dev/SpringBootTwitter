package com.tistory.jimin.twitter.repository;

import com.tistory.jimin.twitter.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
}
