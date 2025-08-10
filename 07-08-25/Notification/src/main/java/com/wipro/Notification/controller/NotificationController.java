package com.wipro.Notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.Notification.dto.NotificationRequest;
import com.wipro.Notification.service.NotificationService;

@RestController
@RequestMapping("/notify")
public class NotificationController {
	
	@Autowired
	NotificationService notificationService;
	
	@PostMapping
    public void sendNotification(@RequestBody NotificationRequest request) {
        notificationService.notifyAction(request);
    }
	

}
