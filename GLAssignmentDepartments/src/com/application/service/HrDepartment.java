package com.application.service;

public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		String departmentName = "HR Department";
		return departmentName;
	}

	public String getTodaysWork() {
		String getTodaysWork = "team Lunch";
		return getTodaysWork;
	}

	public String getWorkDeadline() {
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}

	public static String doActivity() {
		String doActivity = "Fill today’s timesheet and mark your attendance";
		return doActivity;
	}

	public void display(String departmentName, String getTodaysWork, String getWorkDeadline, String isTodayAHoliday,
			String doActivity) {
		System.out.println("Welcome to " + departmentName());
		System.out.println(getTodaysWork());
		System.out.println(doActivity());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		System.out.println("");
	}
}
