package com.uniform.accountplatform.model;

/**
 * 基本用户类
 * @author HenryGe
 *
 */
public class UniformUser extends BaseEntity {

	private String userId;
	
	private String userName;
	
	private String userCellPhone;
	
	private String userEmail;
	
	private String userStatus;

	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserCellPhone() {
		return userCellPhone;
	}


	public void setUserCellPhone(String userCellPhone) {
		this.userCellPhone = userCellPhone;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getUserStatus() {
		return userStatus;
	}


	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	@Override
	public String toString() {
		return this.getUserName();
	}
	
}
