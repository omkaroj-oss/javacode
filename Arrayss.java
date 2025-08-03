package Class5;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayss 
{

	public static void main(String[] args) 
	{
      Scanner s1= new Scanner (System.in);
      System.out.println("Enter the size of array");
      int [] number= new int [s1.nextInt()];
      
      
      for(int i=0;i<number.length;i++)
      {
      
      number[i]=s1.nextInt(); 
      
      }
      
        
        System.out.println(Arrays.toString(number));
		
	}


}
