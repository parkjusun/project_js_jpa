package com.occamsrazor.web.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
	public String name, userId, password, ssn, addr, profile, email, phoneNumber,registerDate;
	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s, %s, %s, %s", name, userId, password, ssn, addr, profile, email ,registerDate);
	}
}
