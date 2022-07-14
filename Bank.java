package ClassTest;
/*create a bank class to calculate withdraw and deposit.if amount will be given from user.
 * if amount is sufficient then “withdraw successful” will going to print.
 * Later on deposit 5000rs in the account balance.
 */
import java.util.*;
public class Bank {

	public static void main(String[] args) {
		int AccBal,WDA;	// variables for future use
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter account balance: ");
		AccBal=sc.nextInt(); //taking input from user for account balance

		System.out.println("Enter withdrwan ammount: ");
		WDA=sc.nextInt();	//taking input from user to withdraw amount
		
		//printing balance after withdraw
		if (AccBal>WDA)
		{
			AccBal-=WDA;
			System.out.println("Withdrawn successful.! \n Your current balance is: "+AccBal);
		}
		else
			System.out.println("You don't have sufficient balance");
		
		AccBal+=5000; //depositing Rs. 5000
			System.out.println("Your Account Balance is: "+AccBal);
	}

}
