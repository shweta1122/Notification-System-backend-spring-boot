package com.nagarro.notificationsystem.repository;

import com.nagarro.notificationsystem.model.NotificationData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationData,Long>{
    
}