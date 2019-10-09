package com.vince.utils;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.vince.bean.User;
//写入用户列表
public class UserIO {
	
	private static ArrayList<User> users=new ArrayList<>();
	private static final String USER_FILE="user.obj";
	
	public boolean writeUsers() {
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(USER_FILE));
			out.writeObject(users);
			out.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public boolean readUsers() {
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream(USER_FILE));
			users=(ArrayList<User>) in.readObject();
			in.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		 
	}
	
	public void add(User user) {
		user.setId(users.size()+1);
		users.add(user);
	}
	
	public User findByUsernameAndPassword(String username,String password) {
		for(User u:users) {
			if(u.getUsername().equals(username)&&u.getPassword().equals(password)) {
				return u;
			}
		}
		return null;
	}

}
