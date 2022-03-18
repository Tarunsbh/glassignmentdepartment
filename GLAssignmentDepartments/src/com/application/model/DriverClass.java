package com.application.model;

import java.util.Scanner;

import com.application.service.AdminDepartment;
import com.application.service.HrDepartment;
import com.application.service.SuperDepartment;
import com.application.service.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {
		int option = 0;
		SuperDepartment sd = new SuperDepartment();
		AdminDepartment ad = new AdminDepartment();
		HrDepartment hd = new HrDepartment();
		TechDepartment td = new TechDepartment();
		String departmentName = sd.departmentName();
		String getTodaysWork = sd.getTodaysWork();
		String getWorkDeadline = sd.getWorkDeadline();
		String isTodayAHoliday = sd.isTodayAHoliday();
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Please select the department from the following");
			System.out.println("  i) Super Department");
			System.out.println(" ii) Admin Department");
			System.out.println("iii) Hr Department");
			System.out.println(" iv) Tech Department");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				sd.display(departmentName, getTodaysWork, getWorkDeadline, isTodayAHoliday);
				break;
			case 2:
				ad.display(departmentName, getTodaysWork, getWorkDeadline, isTodayAHoliday);
				break;
			case 3:
				String doActivity = HrDepartment.doActivity();
				hd.display(departmentName, getTodaysWork, getWorkDeadline, isTodayAHoliday, doActivity);
				break;
			case 4:
				String getTechStackInformation = td.getTechStackInformation();
				td.display(departmentName, getTodaysWork, getWorkDeadline, isTodayAHoliday, getTechStackInformation);
				break;
			default:
				System.out.println("Please select the valid option.");
				System.out.println("");
				break;

			}
		} while (option != 0);
		scanner.close();
	}

}
