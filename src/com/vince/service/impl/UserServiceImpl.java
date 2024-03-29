package com.vince.service.impl;

import com.vince.bean.User;
import com.vince.service.UserService;
import com.vince.utils.BusinessException;
import com.vince.utils.EmptyUtils;
import com.vince.utils.UserIO;

public class UserServiceImpl implements UserService{

	public User register(User user) throws BusinessException {
		// TODO Auto-generated method stub
		UserIO userIO=new UserIO();
		userIO.add(user);
		try {
		userIO.writeUsers();
		}catch(BusinessException e) {
			
		}
		return user;
	}

	@Override
	public User login(String username, String password) throws BusinessException {
		// TODO Auto-generated method stub
		if(EmptyUtils.isEmpty(username)) {
			throw new BusinessException("username.notnull");
		}
		if(EmptyUtils.isEmpty(password)) {
			throw new BusinessException("password.notnull");
		}
		UserIO userIO=new UserIO();
		User user=userIO.findByUsernameAndPassword(username, password);
		return user;
	}

}
