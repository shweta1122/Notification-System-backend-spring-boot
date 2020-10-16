package com.nagarro.notificationsystem.services;

import java.util.List;

import com.nagarro.notificationsystem.model.NotificationData;
import com.nagarro.notificationsystem.repository.NotificationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServices {

    @Autowired
    NotificationRepository notificationRepository;

    public void createNotification(NotificationData notificationData) {
        notificationRepository.save(notificationData);

    }

    public List<NotificationData> getNOtifications() {

        return notificationRepository.findAll();
    }

    public void deleteNotificatipn(NotificationData data) {
        notificationRepository.delete(data);
    }

}