package com.occamsrazor.web.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminSeviceImpl implements AdminService {
	@Autowired AdminDao adminDao;
	
	@Override
	public void register(Admin admin) {
		
		adminDao.insert(admin);
	}

	@Override
	public List<Admin> list() {
		// TODO Auto-generated method stub
		return adminDao.selectAll();
	}

	@Override
	public Admin findOne(String employNumber) {
		// TODO Auto-generated method stub
		return adminDao.selectOne(employNumber);
	}

	@Override
	public void modify(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.update(admin);
	}

	@Override
	public void remove(Admin admin) {
		adminDao.delet(admin);
		
	}




}
