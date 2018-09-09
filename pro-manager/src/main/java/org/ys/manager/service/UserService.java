package org.ys.manager.service;

import java.util.List;

import org.ys.manager.model.User;
import org.ys.manager.model.UserExample;

public interface UserService {
	public User queryUserById(int userId) throws Exception;
	
	public void save(User user) throws Exception;
	
	public void updateById(User user) throws Exception;
	
	public void updateByExaple(User user,UserExample example) throws Exception;
	
	public void delUserById(int userId) throws Exception;
	
	public List<User>queryUserByExample(UserExample example) throws Exception;
}
