package com.occamsrazor.web.user;

import java.util.List;



public interface UserSevice {

	public void register(User user);

	public List<User> findAll();

	public User fideOne(String userid);

	public void modify(User user);

	public void remove(User user);

	
}

