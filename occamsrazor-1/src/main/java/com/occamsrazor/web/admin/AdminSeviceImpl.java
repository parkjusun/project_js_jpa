package com.occamsrazor.web.admin;

import org.springframework.stereotype.Service;

@Service
public class AdminSeviceImpl implements AdminService {

	@Override
	public void add(Admin member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Admin[] list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin[] searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin searchByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin detail(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean login(Admin member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int samCount(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int genderCount(String gender) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(Admin member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Admin member) {
		// TODO Auto-generated method stub
		
	}


}
