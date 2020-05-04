package com.occamsrazor.web.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.occamsrazor.web.util.Data;
import com.occamsrazor.web.util.Messenger;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public void insert(User user) {
//		try {
//			BufferedWriter writer = new BufferedWriter(new FileWriter(new File(Data.ADMIN_PATH.toString()+Data.USER_PATH+Data.CSV),true));
//			writer.write(user.toString());
//			writer.newLine();
//			writer.flush();
//			System.out.println("aaa");
//		
//		} catch (Exception e) {
//			System.out.println(Messenger.FILE_INSERT_ERROR);
//		}
		
		
	}

	@Override
	public List<User> selectAll() {
		List<User> list = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		try {
			File file = new File(Data.ADMIN_PATH + "user_list.csv");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String message = "";
			while ((message = reader.readLine())!=null) {
				temp.add(message);
			}
			reader.close();
			
		}catch(Exception e) {
			System.out.println("에러");
			
		}
		User u = null;
		for(int i=0;i<temp.size();i++) {
			u= new User();
			String[] arr = temp.get(i).split(",");
			
			u.setUserId(arr[0]);
			u.setPassword(arr[1]);
			u.setName(arr[2]);
			u.setSsn(arr[3]);
			u.setAddr(arr[4]);
			u.setProfile(arr[5]);
			u.setEmail(arr[6]);
			u.setPhoneNumber(arr[7]);
			u.setRegisterDate(arr[8]);
			list.add(u);
		}
	
		return list;
	}

	@Override
	public User selectOne(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delet(User user) {
		// TODO Auto-generated method stub
		
	}

}
