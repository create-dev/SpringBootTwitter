package com.tistory.jimin.twitter.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(length=50, nullable=false)
	private String email;
	
	@Column(length=45, nullable=false)
	private String password;
	
	@Column(length=45, nullable=false)
	private String nickname;


	private char grade;
	private int score;
	private Date joinDate;
	
	
	public User(String email, String password, char grade, int score) {
		super();
		this.email = email;
		this.password = password;
		this.grade = grade;
		this.score = score;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
