package com.wipro.user.servie;

import java.util.List;

import com.wipro.user.entity.User;

public interface UserService {

	User createUser(User user);

	User updateUser(int id, User user);

	void deleteUser(int id);

	List<User> getAllUsers();

	User getUser(int id);

}
