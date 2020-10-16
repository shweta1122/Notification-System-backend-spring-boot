package com.nagarro.notificationsystem.services.notificationtypes;

import com.nagarro.notificationsystem.services.INotification;

import com.nagarro.notificationsystem.services.communicationmode.Mail;
import com.nagarro.notificationsystem.services.communicationmode.SMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UrgentHelpNotification implements INotification {

    @Autowired
    Mail mail;

    @Autowired
    SMS sms;

    @Override
    public void sendNotification(String description) {
        mail.sendMail("URGENT-HELP", description);
        sms.sendSms("URGENT-HELP", description);

    }
    
}