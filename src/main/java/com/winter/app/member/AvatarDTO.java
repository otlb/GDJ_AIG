package com.winter.app.member;

import com.winter.app.files.FileDTO;

public class AvatarDTO extends FileDTO{

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
