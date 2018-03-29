import java.text.DecimalFormat;

/*
Name: 		Ash Scarbrough
Class: 		CSCI-C490 Advanced Java
Assignment:	Programming Assignment 1 - EmployeeTest.java
Date:		July 12, 2016

	Statement of Functionality
My program meets all assignment specifications.

	Program Tests
Tests Include: 
	-	creating a new employee with both constructors with negative monthlySalarys
	-	using monthlySalary amounts in double format that has many decimal places checking return 
		of 2 decimal places
	-	using very large monthlySalary amounts
	-	EmployeeTest includes all required tests: negatives values, uses of Strings for Names, annual 
		salaries, monthlySalaries with ten percent raises.
	
	Shortcomings
No obvious shortcomings are evident in this program.  It meets all the required criteria and accurately 
displays the information outlined by the assignment description.
 */

public class EmployeeTest {
	
	//Main Method to test Employee class
	public static void main (String [] args){
		Employee employee1, employee2;
		
		//Test constructor with three parameters, setting monthlySalary to negative
		employee1 = new Employee("Smith", "John", -3200.84);  
		//Test constructor with two parameters
		employee2 = new Employee("Johnson", "William");
		
		//Set decimal format to two places for currency items
		DecimalFormat decForm = new DecimalFormat("#0.00"); 
		
		//print each employee record via programmer specified toString()
		System.out.println(employee1);
		System.out.println(employee2);
		
		//use mutator method to change employee1's monthly salary to 1500.00
		employee1.setMonthlySalary(1500.00);
		
		double e1YearlySalary, e2YearlySalary;
		
		//determine each employees' yearly salary
		e1YearlySalary = (employee1.getMonthlySalary() * 12);
		e2YearlySalary = (employee2.getMonthlySalary() * 12);
		
		//print employees' yearly salary information
		System.out.println("\nThe yearly salary for " + employee1.getFirstName()
			+ " " + employee1.getLastName() + " is $" + decForm.format(e1YearlySalary));
		
		System.out.println("The yearly salary for " + employee2.getFirstName()
			+ " " + employee2.getLastName() + " is $" + decForm.format(e2YearlySalary) + "\n");
		
		//using mutator method setMonthlySalary() increase each employees' salary by 10%
		employee1.setMonthlySalary((e1YearlySalary + (e1YearlySalary * 0.10))/12);
		employee2.setMonthlySalary((e2YearlySalary + (e2YearlySalary * 0.10))/12);	
		
		//print each employee record via programmer specified toString()
		System.out.println(employee1);
		System.out.println(employee2);
		
	} // End  of main method
} // End of EmployeeTest class

/*
Tests:
Negative Value:
Please supply employee's monthly Salary: -10

Employee's Name is John Smith with a monthly salary of $0.00
Employee's Name is William Johnson with a monthly salary of $0.00

The yearly salary for John Smith is 18000.00
The yearly salary for William Johnson is 0.00

Employee's Name is John Smith with a monthly salary of $1650.00
Employee's Name is William Johnson with a monthly salary of $0.00

	

	Small Regular Value Input:

Please supply employee's monthly Salary: 1

Employee's Name is John Smith with a monthly salary of $0.00
Employee's Name is William Johnson with a monthly salary of $1.00

The yearly salary for John Smith is 18000.00
The yearly salary for William Johnson is 12.00

Employee's Name is John Smith with a monthly salary of $1650.00
Employee's Name is William Johnson with a monthly salary of $1.10



Large Value Input:

Please supply employee's monthly Salary: 10000000000000000000000000000000000

Employee's Name is John Smith with a monthly salary of $0.00
Employee's Name is William Johnson with a monthly salary of $10000000000000000000000000000000000.00

The yearly salary for John Smith is 18000.00
The yearly salary for William Johnson is 119999999999999990000000000000000000.00

Employee's Name is John Smith with a monthly salary of $1650.00
Employee's Name is William Johnson with a monthly salary of $10999999999999999000000000000000000.00

*/

