package org.ys.manager.dao;

import java.util.List;

import org.ys.manager.model.User;

public interface UserMapper {
	public User getUser(String userId);  
    
    public List<User> getUserAll();  
      
    public void insertUser(User user);  
      
    public void deleteUser(User user);  
      
    public void updateUser(User user);  
}
