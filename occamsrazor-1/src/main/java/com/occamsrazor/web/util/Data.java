package com.occamsrazor.web.util;

import java.io.File;

public enum Data {
	USER_PATH, ADMIN_PATH, CSV, LIST, USERLIST;

	@Override
	public String toString() {
		String retuneValue = "";
		switch (this) {
		case USER_PATH:
			retuneValue = "C:" + File.separator + "Users" + File.separator + "bit1" + File.separator + "git"
					+ File.separator + "repository3" + File.separator + "occamsrazor-1" + File.separator + "src"
					+ File.separator + "main" + File.separator + "resources" + File.separator + "static"
					+ File.separator + "file" + File.separator;

			break;

		case ADMIN_PATH:

			retuneValue = "C:" + File.separator + "Users" + File.separator + "bit1" + File.separator + "git"
					+ File.separator + "repository3" + File.separator + "occamsrazor-1" + File.separator + "src"
					+ File.separator + "main" + File.separator + "resources" + File.separator + "static"
					+ File.separator + "file" + File.separator;

			break;
		case CSV:
			retuneValue = ".csv";
			break;
		case LIST:
			retuneValue = "admin_list";

		case USERLIST:

			retuneValue = "user_list";

			break;
		default:
			break;
		}
		return retuneValue;
	}
}
