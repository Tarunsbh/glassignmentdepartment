package com.application.service;


public class SuperDepartment {
	public String departmentName() {
		String departmentName = "Super Department";
		return departmentName;
	}

	public String getTodaysWork() {
		String getTodaysWork = "No Work as of now";
		return getTodaysWork;
	}

	public String getWorkDeadline() {
		String getWorkDeadline = "Nil";
		return getWorkDeadline;
	}

	public String isTodayAHoliday() {
		String isTodayAHoliday = "Today is not a holiday";
		return isTodayAHoliday;
	}

	public void display(String departmentName, String getTodaysWork, String getWorkDeadline, String isTodayAHoliday) {
		System.out.println("Welcome to " + departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		System.out.println("");

	}

	
}
