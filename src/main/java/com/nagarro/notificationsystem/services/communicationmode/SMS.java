package com.nagarro.notificationsystem.services.communicationmode;

import com.nagarro.notificationsystem.services.SubscribersService;
import com.nagarro.notificationsystem.template.SmsTemplateImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SMS {

    
    @Autowired
    SubscribersService subscribersService;
    
    SmsTemplateImp smsTemplate = new SmsTemplateImp();
    public void sendSms(String type,String description) {
        System.out.println("SMS SENT");
        smsTemplate.smsBody(type, description,subscribersService.getSubscribers());
        smsTemplate.ending();
       
       
    }
    
}