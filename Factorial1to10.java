package ClassTest;
// to print factorial value from 1 to 10

public class Factorial1to10 {

	public static void main(String[] args) {
		int i,fact=1;
				
		//counting the factorial using for loop
		for(i=1;i<=10;i++)
		{
			fact=fact*i;
			
				//printing the result
		System.out.println("\nFactorial of "+i+" is: "+fact);
		}
	}

}
