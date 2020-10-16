package com.nagarro.notificationsystem.services.factory;

import com.nagarro.notificationsystem.services.INotification;
import com.nagarro.notificationsystem.services.notificationtypes.EventNotification;
import com.nagarro.notificationsystem.services.notificationtypes.HolidayNotification;

import com.nagarro.notificationsystem.services.notificationtypes.NewPolicyNotification;
import com.nagarro.notificationsystem.services.notificationtypes.UrgentHelpNotification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NotificationTypesFactory {

  @Autowired
  HolidayNotification holidayNotification;
  @Autowired
  EventNotification eventNotification;
  
  @Autowired
  UrgentHelpNotification urgentHelpNotification;
  
  @Autowired
  NewPolicyNotification newPolicyNotification;
  
  

  public INotification getNotificationType(String type) {
   
    if (type == null) {
      return null;
    }
    if (type.equalsIgnoreCase("EVENTS")) {
      return eventNotification;
    } else if (type.equalsIgnoreCase("HOLIDAY")) {
      return holidayNotification;
    } else if (type.equalsIgnoreCase("URGENT-HELP")) {
      return urgentHelpNotification;
    } else if (type.equalsIgnoreCase("NEW-POLICY")) {
      return new NewPolicyNotification();
    } else if (type.equalsIgnoreCase("NAGARRO-NEWS")) {
      return newPolicyNotification;
    }

    return null;
  }
}
