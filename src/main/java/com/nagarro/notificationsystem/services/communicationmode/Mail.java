package com.nagarro.notificationsystem.services.communicationmode;

import com.nagarro.notificationsystem.services.SubscribersService;
import com.nagarro.notificationsystem.template.MailTemplate;
import com.nagarro.notificationsystem.template.MailTemplateImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mail {


    @Autowired
    SubscribersService subscribersService;

    MailTemplate mailTemplate = new MailTemplateImp();
    public void sendMail(String type,String description) {
        System.out.println("MAIL SENT");
        mailTemplate.mailSubscribers(subscribersService.getSubscribers());
        mailTemplate.mailSubject(type);
        mailTemplate.mailBody(description);
        mailTemplate.ending();
       
        
    }
    
}