package com.occamsrazor.web.admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.naming.ldap.Rdn;

import org.springframework.stereotype.Repository;

import com.occamsrazor.web.user.User;
import com.occamsrazor.web.util.Data;
import com.occamsrazor.web.util.Messenger;

@Repository
public class AdminDaoimpl implements AdminDao {

	@Override
	public void insert(Admin admin) {
		try {

			BufferedWriter writer = new BufferedWriter(
					new FileWriter(new File(Data.ADMIN_PATH.toString() + Data.LIST + Data.CSV), true));
			writer.write(admin.toString());
			writer.newLine();
			writer.flush();
		} catch (Exception e) {
			System.out.println(Messenger.FILE_INSERT_ERROR);
		} 
	}

	@Override
	public List<Admin> selectAll() {
		List<Admin> list = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(Data.ADMIN_PATH + "admins.csv"));
			String message = "";
			while ((message = reader.readLine())!=null) {
				temp.add(message);
			}
			reader.close();

		} catch (Exception e) {
			System.out.println("에러");
		}
		
		Admin a = null;
		for(int i=0;i<temp.size();i++) {
			a= new Admin();
			String[] arr = temp.get(i).split(",");
			
			a.setEmployNumber(arr[0]);
			a.setPasswd(arr[1]);
			a.setName(arr[2]);
			a.setPosition(arr[3]);
			a.setProfile(arr[4]);
			a.setEmail(arr[5]);
			a.setPhoneNumber(arr[6]);
			a.setRegisterDate(arr[7]);
			list.add(a);
		}

		return list;
	}

	@Override
	public Admin selectOne(String employNumber) {
		Admin admin = null;

		try {

		} catch (Exception e) {

		}

		return admin;
	}

	@Override
	public void update(Admin admin) {
		try {

		} catch (Exception e) {

		}
	}

	@Override
	public void delet(Admin admin) {
		try {

		} catch (Exception e) {

		}
	}

}
