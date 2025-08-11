package com.wipro.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wipro.user.dto.NotificationRequest;

@FeignClient(name = "Notification")
public interface NotificationClient {
	@PostMapping("/notify")
    void sendNotification(@RequestBody NotificationRequest request);

}
