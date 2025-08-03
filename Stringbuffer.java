package Class5;

import java.util.Arrays;

public class Stringbuffer {

	public static void main(String[] args) {
		
		
		StringBuffer s1= new StringBuffer("Omkar Kashintah Joshi");
		              StringBuffer t1 = s1.delete(6, 15);
		              System.out.println(t1);
		              
		              t1.replace(0, 4, "Abhishek");
		              System.out.println(t1);
		
		              StringBuffer s2= new StringBuffer("Omkar Kashintah Joshi");
		              s2.insert(8, "Name");
		              System.out.println(s2);
		              
		              s2.reverse();
		              System.out.println(s2);
		              
		              
		              String input ="River";
		              char[] c1= input.toCharArray();
		              System.out.println(Arrays.toString(c1));
		              
		              
		              StringBuilder T= new StringBuilder("OMM OJSAVI DIVYA");
		              StringBuilder c11=T.append("   KKKK");
		              System.out.println(c11);
		              
		              
		              
		              
		              
		              
		              
	}

}
