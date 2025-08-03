package Class5;

import java.util.Arrays;

public class Bothequalarray {

	public static void main(String[] args) 
	{
		
		int [] rollnoA= new int[4];
		rollnoA[0]=30;
		rollnoA[1]=40;
		rollnoA[2]=50;
		rollnoA[3]=60;
		
		System.out.println(Arrays.toString(rollnoA));
			
		int [] rollnoB= new int[4];
		rollnoB[0]=30;
		rollnoB[1]=40;
		rollnoB[2]=50;
		rollnoB[3]=40;
		
		System.out.println(Arrays.toString(rollnoB));
		
	boolean c1=	Arrays.equals(rollnoA, rollnoB);
	System.out.println(c1);
		

	}

}
