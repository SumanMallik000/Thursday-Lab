package ClassTest;
	//write a program to calculate gross salary of an employee.

import java.util.*;
public class EmpSalary {

	public static void main(String[] args) {
		int basic,da,hra,gross;
		System.out.println("enter basic salary: ");
		Scanner sc=new Scanner(System.in);
		basic=sc.nextInt(); //taking input from user
		
		if (basic>1500) // calculation for basic salary more than Rs. 1500/-
		{
			da=basic*90/100;  
			hra=basic*20/100;
		}
		else		// Calculation for normal basic salary.
		{
			da=basic*70/100;
			hra=500;
	}
		//calculation of gross salary
		gross=da+hra+basic;
		System.out.println("Gross salary is: "+gross);
	}
}
