package com.nagarro.notificationsystem.template;

import java.util.List;

import com.nagarro.notificationsystem.model.Subscriber;

public class OnlineTemplateImp implements OnlineTemplate {

	@Override
	public void portalBody(String title, String description, List<Subscriber> subscribers) {
		System.out.println("Title : " + title + "\n Decsription :" + description + "\n ");
		System.out.print("Subscribers :");
		for (Subscriber subs : subscribers) {
			System.out.print(subs.getUserName() + ","
		);
		}
		System.out.println();
	}

	@Override
	public void ending() {
		System.out.println("\nRegards\nNagarro team");
		System.out.println("================================================================================");
	}

	

	
	
}
