package ClassTest;
import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		{
			char alphabet;
			Scanner cw=new Scanner(System.in);
			System.out.println("Enter the Alphabet: ");
			alphabet=cw.next().charAt(0);
			if(alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u')
				System.out.println(alphabet+" is vowel");
			else
				System.out.println(alphabet+" is consonant");
		
	}

}
}