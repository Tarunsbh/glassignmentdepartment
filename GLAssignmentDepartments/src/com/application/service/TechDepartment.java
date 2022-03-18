package com.application.service;

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		String departmentName = "Tech Department";
		return departmentName;
	}

	public String getTodaysWork() {
		String getTodaysWork = "Complete coding of module 1";
		return getTodaysWork;
	}

	public String getWorkDeadline() {
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}

	public String getTechStackInformation() {
		String getTechStackInformation = "Core Java";
		return getTechStackInformation;
	}

	public void display(String departmentName, String getTodaysWork, String getWorkDeadline, String isTodayAHoliday,
			String getTechStackInformation) {
		System.out.println("Welcome to " + departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday());
		System.out.println("");
	}

}
