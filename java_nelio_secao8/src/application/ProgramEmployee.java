package application;

import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Enter name: ");
		emp.name = sc.nextLine();
		System.out.print("Enter Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Enter Tax: ");
		emp.tax = sc.nextDouble();
				
		System.out.println();
		System.out.println("Employee: " + emp);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + emp);
		
		
		
		sc.close();
		 

	}

}
