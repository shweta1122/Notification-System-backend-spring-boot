package com.nagarro.notificationsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "subscriber")
public class Subscriber {

    public Subscriber(int id, String userName, Long phoneNumber) {
		super();
		this.id = id;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
	}

	@Id
	@Column(name="id")
	private int id;


    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name="userName")
   private String userName;

    @Column(name="phoneNumber")
   private Long phoneNumber;
}