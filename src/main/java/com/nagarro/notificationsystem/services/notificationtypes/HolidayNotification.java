package com.nagarro.notificationsystem.services.notificationtypes;

import com.nagarro.notificationsystem.services.INotification;
import com.nagarro.notificationsystem.services.communicationmode.EmployeeOnlinePortal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HolidayNotification implements INotification {
    @Autowired
    EmployeeOnlinePortal employeePortal;

    @Override
    public void sendNotification(String description) {
       
        employeePortal.sendOnlinePortal("Holiday", description);

    }
    
}