package com.occamsrazor.web.item;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Loss {
	public String index , itemName, itemRegisterDate, classify, location;
	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s", index , itemName, itemRegisterDate, classify, location);
	}

}
