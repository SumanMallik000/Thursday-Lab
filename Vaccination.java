package basics;

import java.util.Scanner;
/*create abstract class vaccine.create 2 concrete method firstDose() and 2ndDose().
Scenario 1:user can take first dose if user is Indian and age is 18.after vaccination user has to pay 250rs. 
Scenario 2: user can take 2nd dose if already the first dose has completed.
Scenario 3: create abstract method boosterDose() in abstract class Vaccine.create one implementation class vaccinationSuccessful where implement boosterDose() method.
Create main class vaccination and invoke all methods accord*/

//create abstract class vaccine
abstract class Vaccine
{
	abstract public void boosterDose(char com1);//abstract method boosterDose
	public void firstDose(int age,String country)//concrete method firstDose
	{
		if(age>=18 && country.equals("India"))
		{
			
			System.out.println("You are eligible for vaccination\nYou Have to pay Rs.250");
		}
		else {
			System.out.println("You are not eligible for vacination");
			System.exit(0);
		}
	}
	public void sencondDose(char com)// concrete method secondDose
	{
		if(com=='Y'||com=='y')
		{
			System.out.println("Now you are eligible for 2nd Does");
		}
		else {
			System.out.println("Now you are not eligible for 2nd Does");
		System.exit(0);}
			
	}
	}
class VaccinationSuccessful extends Vaccine // create a class VaccinationSuccessful
{

	@Override
	public void boosterDose(char com1) {// implemntation of abstract method
		// TODO Auto-generated method stub
		if(com1=='Y'||com1=='y') {
			System.out.println("you are eligible to take Booster Dose");
		System.out.println("Vaccination Successful");
		}
		else
			System.out.println("Vaccination is pending");
	}
	}


public class Vaccination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instantiate scanner class
				Scanner sc=new Scanner(System.in);
				//instantiate the VaccinationSuccessful class
				Vaccine vc=new VaccinationSuccessful();
				System.out.println("Welcome to Cowin: ");
				System.out.println("Enter your age: ");
				int age=sc.nextInt();
				System.out.println("Enter your country: ");
				String country=sc.next();
				vc.firstDose(age,country);//call the firstDose method
				System.out.println("is your 1st dose is complete:(Y/N)?");
				char com=sc.next().charAt(0);
				vc.sencondDose(com);//call the secondDose method
				System.out.println("is your 2nd dose is complete:(Y/N)?");
				char com1=sc.next().charAt(0);
				vc.boosterDose(com1);//call the boosterDose
		
	}

}
