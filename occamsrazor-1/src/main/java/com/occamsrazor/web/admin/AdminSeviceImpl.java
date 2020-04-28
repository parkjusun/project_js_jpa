package com.occamsrazor.web.admin;

import org.springframework.stereotype.Service;

@Service
public class AdminSeviceImpl implements AdminService {
	public Admin[] members;
	public int count;
	
	public AdminSeviceImpl() {
		// TODO Auto-generated constructor stub
		members = new Admin[5];
		count = 0;

	}

	@Override
	public void add(Admin member) {
		// TODO Auto-generated method stub
		members[count] = member;
		count++;
	}

	@Override
	public Admin[] list() {
		// TODO Auto-generated method stub

		return members;
	}

	@Override
	public Admin[] searchByName(String name) {

		int nameCount = samCount(name);
		Admin[] membersName = null;

		int searchCount = samCount(name);
		if (searchCount != 0) {
			membersName = new Admin[nameCount];
			int j = 0;
			for (int i = 0; i < count; i++) {
				if (name.equals(members[i].getName())) {
					membersName[j] = members[i];
					j++;
					if (searchCount == j) {
						break;
					}
				}
			}
		}
		return membersName;
	}

	@Override
	public Admin searchByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin detail(String userid) {
		Admin userIdMember = new Admin();

		for (int i = 0; i < members.length; i++) {
			if (userid.equals(members[i].getUserId())) {
				userIdMember = members[i];
			}
		}

		return userIdMember;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public int samCount(String name) {
		int countName = 0;

		// TODO Auto-generated method stub
		for (int i = 0; i < members.length; i++) {
			if (name.equals(members[i].getName())) {
				countName++;
			}
		}
		return countName;
	}

	@Override
	public int genderCount(String gender) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean login(Admin member) {
		// TODO Auto-generated method stub
		boolean loginOk = true;
		for (int i = 0; i < members.length; i++) {
			if (member.getUserId().equals(members[i].getUserId()) 
					&& member.getPassword().equals(members[i].getPassword()))  {
				loginOk = true;
				break;
			}else {
				loginOk = false;
				break;
			}
		}
		
		
		return loginOk;
	}

	@Override
	public void update(Admin member) {
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++) {
			if (member.getUserId().equals(members[i].getUserId())) {
				members[i].setPassword(member.getPassword());
				break;
			}

		}
	}

	@Override
	public void delete(Admin member) {
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++) {
			if (member.getUserId().equals(members[i].getUserId())
					&& member.getPassword().equals(members[i].getPassword())) {
				members[i] = members[count - 1];
				members[count - 1] = null;
				count--;

			}

		}

	}

}
