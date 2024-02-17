package com.harshal.employee;
import java.util.Random;
public class Employee {
	public static void main(String [] args) {
		int attendance;
		final int wege_per_hr=20;
		final int full_day_hr=8;
		int dayly_wege;
		
		System.out.println("Welcome to Employee Wage Computation on master Branch");
		Random random=new Random();
		attendance=random.nextInt(9)%2;
		
	
		
		System.out.println(attendance);
		if(attendance==0) {
			
			System.out.println("Employee is Absent");
		}
		else{
			System.out.println("Employee is present");
			dayly_wege=	wege_per_hr *full_day_hr;
			
			System.out.println(dayly_wege);
		}
		
	}
	

}
