package com.nagarro.notificationsystem.services.notificationtypes;

import com.nagarro.notificationsystem.services.INotification;
import com.nagarro.notificationsystem.services.communicationmode.EmployeeOnlinePortal;
import com.nagarro.notificationsystem.services.communicationmode.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EventNotification implements INotification{

    @Autowired
    EmployeeOnlinePortal employeePortal;
    @Autowired
    Mail mail;
    
    @Override
    public void sendNotification(String description) {
        
        mail.sendMail("EVENT", description);
        employeePortal.sendOnlinePortal("EVENT", description);

    }
    
}