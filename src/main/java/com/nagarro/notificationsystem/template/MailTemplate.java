package com.nagarro.notificationsystem.template;

import java.util.List;

import com.nagarro.notificationsystem.model.Subscriber;

public interface MailTemplate {
	public  void mailSubscribers(List<Subscriber> subscriber);

	public void mailSubject(String sub);

	public void mailBody(String body);

	public  void ending();


}
