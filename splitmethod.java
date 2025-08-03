package Class5;

import java.util.Arrays;

public class splitmethod {

	public static void main(String[] args) {

     String input="My name is omkar";
      String[] c1 = input.split(" ");
     System.out.println(Arrays.toString(c1));
     
           String[] c2=input.split(" ", 3);
           System.out.println(Arrays.toString(c2));
     
     
         char [] t1=input.toCharArray();
         
         System.out.println(Arrays.toString(t1));

	}

}
