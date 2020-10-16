package com.nagarro.notificationsystem.services.communicationmode;

import com.nagarro.notificationsystem.services.SubscribersService;
import com.nagarro.notificationsystem.template.OnlineTemplateImp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeOnlinePortal {

    @Autowired
    SubscribersService subscribersService;

   
    OnlineTemplateImp portal = new OnlineTemplateImp();
    public void sendOnlinePortal(String type,String description) {
       System.out.println("Online Portal Sent");
        portal.portalBody(type, description, subscribersService.getSubscribers());
        
        portal.ending();
    }
}