package ClassTest;
// print pattern of 1 to 5
import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		
		int i,j;
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
	
	
