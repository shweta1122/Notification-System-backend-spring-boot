package com.nagarro.notificationsystem.services.notificationtypes;

import com.nagarro.notificationsystem.services.INotification;

import com.nagarro.notificationsystem.services.communicationmode.EmployeeOnlinePortal;
import com.nagarro.notificationsystem.services.communicationmode.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NewPolicyNotification implements INotification {

    @Autowired
    Mail mail;

    @Autowired
    EmployeeOnlinePortal onlinePortal;
    @Override
    public void sendNotification(String description) {
       
        mail.sendMail("NEW-POLICY", description);
        onlinePortal.sendOnlinePortal("NEW-POLOCY", description);

    }
    
}