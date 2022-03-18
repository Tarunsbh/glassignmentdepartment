package com.application.service;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		String departmentName = "Admin Department";
		return departmentName;
	}

	public String getTodaysWork() {
		String getTodaysWork = "Complete your documents submission";
		return getTodaysWork;
	}

	public String getWorkDeadline() {
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}

}
