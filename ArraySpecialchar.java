package Class5;

public class ArraySpecialchar {

    static int countalpha=0;
    static int countspace=0;
    static int countnumber=0;
	public static void main(String[] args) 
	{
		String input="k1 no 2 maharashtra@";
		int size=input.length();
		System.out.println(size);
	
	
		for(int i=0;i<=input.length()-1;i++)
		{
		
		boolean b1=Character.isAlphabetic(input.charAt(i));
		boolean b2=Character.isWhitespace(input.charAt(i));
		boolean b3=Character.isDigit(input.charAt(i));
		int countofspecialcharacter= input.length()-(countalpha+countspace+countnumber);
		
		System.out.println();
		
		
		if(b1==true)
		{
			countalpha++;
		}
		
		if (b2==true)
		{
			countspace++;
		}
		if (b3==true)
		{
			countnumber++;
		}
		}
		System.out.println("Alphabets" +countalpha);
		System.out.println("Space" +countspace);
		System.out.println("number" +countnumber);
		int countofspecialcharacter= input.length()-(countalpha+countspace+countnumber);
		System.out.println(countofspecialcharacter);
		
	}

}
