package basicprogram;

class Employee2 {
	// instance variable of the class Employee
	long employeeId;
	String  employeeName, employeeAddress;
	Long   employeePhone;
	double basicSalary,specialAllowance=250.80,Hra=1000.50;
	
	// overloaded constructor in the employee class, which takes the below constructor 
	// parameters and initializes them to their respective instance variables
	Employee2(int id,String Name,String address,long phone,double basicSalary) {
		employeeId=id; employeeName=Name;
		employeeAddress=address; employeePhone=phone;
		this.basicSalary=basicSalary;
	}
	/* 
 	method called calculateTransportAllowance in Employee class will 
    calculate the transport allowance by calculating 10% (default allowance) of the salary	
	*/
	public double calculateTransportAllowence() {
		 double transportallowence=(double)10/100*basicSalary;
		System.out.println("Transport Allownce is: "+transportallowence);
		 return transportallowence; 
	}
	//a method calculateSalary in which the basic salary is calculated
	public double  calculateSalary() {
		double salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*
				Hra/100);
		System.out.println("Salary is: "+salary);
		return salary;
	}
}
// sub class Engineer  with base class Employee
class Engineer extends Employee2 {
	Engineer(int id, String Name, String address, long phone,double basicSalary) {
		super(id, Name, address, phone,basicSalary);
	}
/*
 * For a Engineer, the transportation allowance is 15% of the basic salary. So override the 
calculateTransportAllowance method in Engineer class which should calculate the 
transport allowance as 15% of the base salary.
 */
	public double  calculateTransportAllowence() {
		 double transportallowence=(double)15/100*basicSalary;
		 System.out.println("Basic salary is: "+basicSalary);
		 System.out.println("Transport Allownce is: "+transportallowence);
		 return transportallowence;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Engineer [Employee Id=");
		builder.append(employeeId);
		builder.append(", Employee Name=");
		builder.append(employeeName);
		builder.append(", Employee Address=");
		builder.append(employeeAddress);
		builder.append(", Employee Phone=");
		builder.append(employeePhone);
		builder.append(", Basic Salary=");
		builder.append(basicSalary);
		builder.append(" ]");
		return builder.toString();
	}
}
// sub class Senior Engineer with base class Employee
class SeniorEngineer extends Employee2 {
	SeniorEngineer(int id, String Name, String address, long phone,double basicSalary) {
		super(id, Name, address, phone,basicSalary);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Senior Engineer [Employee Id=");
		builder.append(employeeId);
		builder.append(", Employee Name=");
		builder.append(employeeName);
		builder.append(", Employee Address=");
		builder.append(employeeAddress);
		builder.append(", Employee Phone=");
		builder.append(employeePhone);
		builder.append(", Basic Salary=");
		builder.append(basicSalary);
		builder.append(" ]");
		return builder.toString();
	}
}

	public class Inheritance_Activity {
	  public static void main(String[] args) {
		  
		  Engineer obj=new Engineer(1137, "Suman", "Haldia", 9474401420L, 32500);
		  System.out.println(obj);
		  obj.calculateSalary();
		  obj.calculateTransportAllowence();
		  System.out.println("--------------------------------------");
		  SeniorEngineer obj2=new SeniorEngineer(1136, "Debjit", "Kolkata", 8444356945L, 42500);
		  System.out.println(obj2);
		  obj2.calculateSalary();
		  obj2.calculateTransportAllowence();

	  }

}
