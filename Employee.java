import java.text.DecimalFormat;
import java.util.Scanner; 


/*
Name: 		Ash Scarbrough
Class: 		CSCI-C490 Advanced Java
Assignment:	Programming Assignment 1 - Employee.java
Date:		July 12, 2016
*/

class Employee {
	
	private String lastName, firstName;		//Class instance variables
	private double monthlySalary;
	
	DecimalFormat decForm = new DecimalFormat ("#0.00");  //Set format to two decimal places
	
	//Constructor with input for all three instance variables
	Employee (String last, String first, double monthlySal){
		lastName = last;
		firstName = first;
		monthlySalary = monthlySal;
		
		if (monthlySalary < 0)	//If monthly salary is negative, change it to zero
			monthlySalary = 0;
	} //End of Constructor(string, string, double)

	//Constructor with input for first and last name
	Employee (String last, String first){
		lastName = last;
		firstName = first;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please supply employee's monthly Salary: "); // Ask for employee salary
		monthlySalary = (double) input.nextDouble();  // Get monthlySalary input from user
		
		System.out.print("\n");
		
		if (monthlySalary < 0)	//If monthly salary is negative, change it to zero
			monthlySalary = 0;
	} //End of Constructor (string, string)
	
	//Accessor Method to get last name returned as string
	public String getLastName(){
		return lastName;
	} //End of method getLastName
	
	//Accessor Method to get first name returned as string
	public String getFirstName(){
		return firstName;
	} //End of method getFirstName
	
	//Accessor Method to get monthly salary returned as double
	public double getMonthlySalary(){
		return monthlySalary;
	} //End of method getMonthlySalary
	
	//Mutator Method to set last name from value of String parameter
	void setLastName(String lname){
		lastName = lname;
	} //End of method setLastName
	
	//Mutator Method to set first name from value of String parameter
	void setFirstName (String fname){
		firstName = fname;
	} //End of method setFirstName
	
	//Mutator Method to set monthly salary from value of double parameter
	void setMonthlySalary(double monthlysalary){
		monthlySalary = monthlysalary;
	} //End of method setMonthlySalary
	
	//Method prints out the class instance variables in intelligible format
	public String toString(){
		String employeeInfo = "Employee's Name is " + firstName + " " +
				lastName + " with a monthly salary of $" + decForm.format(monthlySalary);
		return employeeInfo;
	} //End of method toString
	
	//Method to determine if two objects of type Employee have same values
	public boolean equal(Employee e2){
		return ((getFirstName() == e2.getFirstName()) && (getLastName() == e2.getLastName()) && 
				getMonthlySalary() == e2.getMonthlySalary());
	} //End of method equal
}
