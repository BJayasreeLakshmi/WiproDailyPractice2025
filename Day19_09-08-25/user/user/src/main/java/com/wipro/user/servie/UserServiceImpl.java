package com.wipro.user.servie;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.user.client.NotificationClient;
import com.wipro.user.dto.NotificationRequest;
import com.wipro.user.dto.UserDto;
import com.wipro.user.entity.User;
import com.wipro.user.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	private NotificationClient notificationClient;
	
	
	 @Override
	    public User createUser(User user) {
	        User newUser = userRepo.save(user);
	        notify(newUser, "Created");
	        return newUser;
	    }
	 
	 
	 @Override
	    public User updateUser(int id, User user) {
	        User existing = userRepo.findById(id).orElseThrow();
	        existing.setUsername(user.getUsername());
	        existing.setPassword(user.getPassword());
	        existing.setAddress(user.getAddress());
	        User updated = userRepo.save(existing);
	        notify(updated, "Updated");
	        return updated;
	    }
	 
	 @Override
	    public void deleteUser(int id) {
	        User existing = userRepo.findById(id).orElseThrow();
	        userRepo.delete(existing);
	        notify(existing, "Deleted");
	    }
	 
	 @Override
	    public User getUser(int id) {
	        return userRepo.findById(id).orElseThrow();
	    }

	    @Override
	    public List<User> getAllUsers() {
	        return userRepo.findAll();
	    }
	    
	    private void notify(User user, String action) {
	        UserDto dto = new UserDto(user.getUsername(), user.getPassword(), user.getAddress());
	        NotificationRequest request = new NotificationRequest(dto, action);
	      
	        notificationClient.sendNotification(request);
	    }

}
