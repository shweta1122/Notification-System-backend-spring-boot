package com.nagarro.notificationsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "notificationdata")
public class NotificationData {

    public NotificationData(int id, String type, String description) {
		super();
		this.id = id;
		this.type = type;
		this.description = description;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name="type")
    String type;

    @Column(name="description")
    String description;
}