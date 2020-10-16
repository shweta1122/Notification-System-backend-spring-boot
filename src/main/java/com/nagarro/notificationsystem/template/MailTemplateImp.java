package com.nagarro.notificationsystem.template;

import java.util.List;

import com.nagarro.notificationsystem.model.Subscriber;

public class MailTemplateImp implements MailTemplate {

	@Override
	public void mailSubscribers(List<Subscriber> subscriber) {
		System.out.print("To :");
		for (Subscriber subs : subscriber) {
			System.out.print(subs.getUserName() + ","
		);
		}
		System.out.println();

	}

	@Override
	public void mailSubject(String sub) {
		System.out.println("This is from nagarro side \n Subject :" + sub + "\n");
	}

	@Override
	public void mailBody(String body) {
		System.out.println("Hi\n" + body);
	}

	@Override
	public void ending() {
		System.out.println("\nThanks & Regards\nNagarro team");
		System.out.println("============================================================================================================================");
	}

	
}
