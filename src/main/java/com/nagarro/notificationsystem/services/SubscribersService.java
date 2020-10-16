package com.nagarro.notificationsystem.services;

import java.util.List;

import com.nagarro.notificationsystem.model.Subscriber;
import com.nagarro.notificationsystem.repository.SubscriberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscribersService {
    @Autowired
    SubscriberRepository subscriberRepository;

    public List<Subscriber> getSubscribers() {
      
       
        return subscriberRepository.findAll();

    }

}