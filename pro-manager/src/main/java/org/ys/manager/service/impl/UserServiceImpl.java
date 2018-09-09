package org.ys.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ys.manager.dao.UserMapper;
import org.ys.manager.model.User;
import org.ys.manager.model.UserExample;
import org.ys.manager.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;	

	@Override
	public User queryUserById(int userId) throws Exception {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public void save(User user) throws Exception {
		if(null != user){
			userMapper.insert(user);
		}
	}

	@Override
	public void updateById(User user) throws Exception {
		if(null != user){
			userMapper.updateByPrimaryKey(user);
		}
	}

	@Override
	public void updateByExaple(User user, UserExample example) throws Exception {
		if(null != user && null != example){
			userMapper.updateByExample(user, example);
		}
	}

	@Override
	public void delUserById(int userId) throws Exception {
		userMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public List<User> queryUserByExample(UserExample example) throws Exception {
		if(null != example){
			return userMapper.selectByExample(example);
		}
		return null;
	}

}
