package com.wipro.Notification.service.impl;

import org.springframework.stereotype.Service;

import com.wipro.Notification.dto.NotificationRequest;
import com.wipro.Notification.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService{

	@Override
	public void notifyAction(NotificationRequest request) {
		System.out.println("User "+request.getUser().getUsername()+" is "+request.getAction());
		
	}

}
