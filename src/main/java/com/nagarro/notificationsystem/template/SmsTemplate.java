package com.nagarro.notificationsystem.template;

import java.util.List;

import com.nagarro.notificationsystem.model.Subscriber;

public interface SmsTemplate {
	
	public  void smsBody(String title, String description, List<Subscriber> subscribers);
	public  void ending();
}
