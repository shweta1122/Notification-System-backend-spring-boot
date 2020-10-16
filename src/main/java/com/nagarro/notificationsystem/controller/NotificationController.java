package com.nagarro.notificationsystem.controller;

import java.util.List;

import com.nagarro.notificationsystem.model.NotificationData;

import com.nagarro.notificationsystem.services.INotification;
import com.nagarro.notificationsystem.services.NotificationServices;

import com.nagarro.notificationsystem.services.factory.NotificationTypesFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class NotificationController {

    @Autowired
    NotificationServices notificationService;

    @Autowired
    NotificationTypesFactory notificationFactory;


    @PostMapping("/")
    public String sendNotification(@RequestBody NotificationData data) {
        notificationService.createNotification(data);

        INotification notify = notificationFactory.getNotificationType(data.getType());

        notify.sendNotification(data.getDescription());
        return "Notification Sent";
       
    }

    @GetMapping("/")
    public List<NotificationData> getAllNotification() {

        return notificationService.getNOtifications();

    }

  
    @PostMapping("/delete")
    public void clearNotification(@RequestBody NotificationData data ) {
        notificationService.deleteNotificatipn(data);

    }

}