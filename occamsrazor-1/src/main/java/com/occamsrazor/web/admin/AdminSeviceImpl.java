package com.occamsrazor.web.admin;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminSeviceImpl implements AdminService {
	@Autowired
	AdminDao adminDao;

	@Override
	public void register(Admin admin) {

		admin.setEmployNumber(creatEmployNumber());
		admin.setPasswd("1");
		admin.setRegisterDate(creatRegisterDate());

		System.out.println(admin.toString());

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

	public String creatEmployNumber() {
		String ranIdex = "";

		for (int i = 0; i < 4; i++) {
			ranIdex += (int) Math.random() * 10;
		}
		
//		for (int i = 0; i < 9000; i++) {
//			ranIdex = new Random().nextInt(i) + 1000;
//		}
//		ranIdex = (int) (Math.random() * 8999) + 1001;

		return ranIdex;
	}

	public String creatRegisterDate() {

		return new SimpleDateFormat("yyyy-mm-dd").format(new java.util.Date());
	}

}
