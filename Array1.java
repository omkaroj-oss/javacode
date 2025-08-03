package Class5;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) 
	{
	
	 Scanner s1= new Scanner(System.in);
	System.out.println("Please enter tha size of array");
	int[] rollno= new int[s1.nextInt()];
	
	
	for(int i=0;i<rollno.length;i++)
	{
	rollno[i]=s1.nextInt();
	}
	
	System.out.println(Arrays.toString(rollno));
	
	
	}

}