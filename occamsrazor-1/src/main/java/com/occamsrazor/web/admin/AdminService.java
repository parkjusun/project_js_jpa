package com.occamsrazor.web.admin;

public interface AdminService {
	
	public void add(Admin member);
	public Admin[] list();
	public Admin[] searchByName(String name);
	public Admin searchByGender(String gender);
	public Admin detail(String userid);
	public int count();
	
	public boolean login(Admin member);
	
	public int samCount(String name);
	public int genderCount(String gender);
	public void update(Admin member);
	public void delete(Admin member);
	
}
