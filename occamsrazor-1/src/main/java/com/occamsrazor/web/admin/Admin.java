package com.occamsrazor.web.admin;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Component
@Getter @Setter
public class Admin {
	public String employNumber, passwd, name ,position, profile, email , phoneNumber, registerDate;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s",employNumber,passwd,name,position,profile,email,phoneNumber,registerDate);
	}

}

