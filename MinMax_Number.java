package ArrayExamples;
	// wap  to find out maximum and minimum number in array.
import java.util.Scanner;


public class MinMax_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		
		System.out.println("The size of the array: ");
		int num=sc.nextInt();
		int arr[]=new int[num];  //creating the array size
		
		for (int i=0;i<num;i++)
		{
			System.out.println("\n Enter Number: ");
			arr[i]=sc.nextInt();
		}
		int max = arr[0];	//first maximum number
		int min = arr[0];	//first minimum number
		
		for (int i=0;i<num;i++)
		{
			if (arr[i]>max)	//checking maximum number
				max=arr[i];
			
			if (arr[i]<min)	//checking minimum number
				min=arr[i];
		}
		
		//result printing
			System.out.println("\n Maximum number is: "+max);
			System.out.println("\n Minimum number is: "+min);
		
	}

}
