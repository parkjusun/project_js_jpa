package com.occamsrazor.web.admin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.springframework.stereotype.Service;

import com.occamsrazor.web.util.Data;
import com.occamsrazor.web.util.Messenger;

@Service
public class AdminSeviceImpl implements AdminService {
	File file = null;
	
	public AdminSeviceImpl() {
		file = new File(Data.ADMIN_PATH.toString()+Data.LIST+Data.CSV);
	}
	
	@Override
	public void register(Admin admin) {
		try {
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			String message = admin.toString();
			writer.write(message);
			writer.newLine();
			writer.flush();
		} catch (Exception e) {
			System.out.println(Messenger.FILE_WRITER_ERROR);
		}
		
	}

	@Override
	public List<Admin> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findOne(String employNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Admin admin) {
		// TODO Auto-generated method stub
		
	}




}
