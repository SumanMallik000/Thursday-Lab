package ClassTest;
//check whether a number is divisible by 5 and 11 or not
import java.util.Scanner;

public class DivisibleNumber {

	public static void main(String[] args) {
		{
			int number;
			Scanner cw=new Scanner(System.in);
					System.out.println("Enter the number: ");
					number=cw.nextInt();
					if(number%5==0 && number%11==0)
						System.out.println(number+" is divisible by 5 and 11");
					else
						System.out.println(number+" is not divisible by 5 and 11");

		}

	}
 }
