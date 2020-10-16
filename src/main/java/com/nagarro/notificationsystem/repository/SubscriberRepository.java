package com.nagarro.notificationsystem.repository;

import com.nagarro.notificationsystem.model.Subscriber;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Long>{
    
}