package Class5;

import java.util.Arrays;

public class Arraycopytoreverseorder {

	public static void main(String[] args) {
		
		
		int [] input= new int[4];
		input[0]=11;
		input[1]=12;
		input[2]=13;
		input[3]=14;
		
		System.out.println(Arrays.toString(input));
		
		int [] reverse= new int[input.length];
		
		
		for (int i=0,j=input.length-1;i<input.length;i++,j--)
		{
		
		reverse[j]=input[i];
		}
		
		System.out.println("Input array" +Arrays.toString(input));
		System.out.println("output array" +Arrays.toString(reverse));
		
	}

}
