package com.nagarro.notificationsystem.services.notificationtypes;

import com.nagarro.notificationsystem.services.INotification;
import com.nagarro.notificationsystem.services.communicationmode.EmployeeOnlinePortal;
import com.nagarro.notificationsystem.services.communicationmode.Mail;

import org.springframework.beans.factory.annotation.Autowired;

public class NagarroNewsNotification implements INotification {

    @Autowired
    Mail mail;

    @Autowired
    EmployeeOnlinePortal onlinePortal;
    @Override
    public void sendNotification(String description) {
       mail.sendMail("NAGARRO-NEWS", description);
       onlinePortal.sendOnlinePortal("NAGARRO-NEWS", description);

    }
    
}