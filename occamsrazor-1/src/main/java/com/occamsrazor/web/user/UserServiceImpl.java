package com.occamsrazor.web.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserSevice {
	private Map<String, Object> map;


	public UserServiceImpl() {
		map = new HashMap<>();
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		map.put(user.getUserId(), user);

	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		User returnUser = null;
		if (map.containsKey(user.getUserId())) {
			User u = detail(user.getUserId());
			if (user.getPassword().equals(u.getPassword())) {
				returnUser = u;
			}
		}
		return returnUser;
	}

	@Override
	public User detail(String userid) {
		// TODO Auto-generated method stub

		return (User) map.get(userid);
	}

	@Override
	public boolean update(User user) {
		map.replace(user.getUserId(), user);

		return true;
	}

	@Override
	public void delet(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return map.size();
	}

	@Override
	public boolean remove(String userid) {
		// TODO Auto-generated method stub
		map.remove(userid);
		return true;
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<>();
		@SuppressWarnings("rawtypes")
		Set set = map.entrySet();

		@SuppressWarnings("rawtypes")
		Iterator it = set.iterator();

		while (it.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<String, User> e = (Entry<String, User>) it.next();
			list.add(e.getValue());
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		return list;
	}




}
