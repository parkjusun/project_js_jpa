package com.occamsrazor.web.admin;

import java.util.List;

public interface AdminService {
	
	public void register(Admin Admin);
	public  List<Admin> list();
	public Admin findOne(String employNumber);
	public void modify(Admin admin);
	public void remove(Admin admin);


	
}
