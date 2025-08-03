package Class5;

import java.util.Arrays;

public class Copyonearraytoanotherarry {

	public static void main(String[] args) {
	
		int [] rollnumber= new int[4];
		rollnumber[0]=21;
		rollnumber[1]=22;
		rollnumber[2]=23;
		rollnumber[3]=24;
		
		
		int [] Reverse= new int[4];
		
		for(int i=0;i<rollnumber.length;i++)
		{
		Reverse[i]=rollnumber[i];
		}
		
		
		System.out.println("input array" +Arrays.toString(rollnumber));
		System.out.println("Output array" +Arrays.toString(Reverse));

	}

}
