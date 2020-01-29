package com.tistory.jimin.twitter.model;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private UUID id;
	
	@Column(length=50, nullable=false)
	private String email;
	
	@Column(length=45, nullable=false)
	private String password;
	
	@Column(length=45, nullable=false)
	private String nickname;

	private char grade;
	private int score;
	private Date joinDate;
	
	@Autowired
	public User() {

	}

	@Autowired
	public User(UUID id, String email, String password, String nickname, char grade, int score, Date joinDate) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.grade = grade;
		this.score = score;
		this.joinDate = joinDate;
	}
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
}
