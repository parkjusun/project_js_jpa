package com.occamsrazor.web.admin;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Admin {
	public String employNumber, passwd, name ,position, profile, email , phoneNumber, registerDate;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s",employNumber,passwd,name,position,profile,email,phoneNumber,registerDate);
	}

}

