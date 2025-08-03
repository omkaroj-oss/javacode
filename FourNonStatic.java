package Class1;

public class FourNonStatic {

	void add(int a, int b)
	{
		System.out.println("Addition");
	}
	
	void subtract (boolean a, double b)
	{
		System.out.println("Subtraction");
	}
	
	void mul(int i)
	{
		System.out.println("Multiplication");
	}
	
	
	
	public static void main(String[] args) 
	{
		
		FourNonStatic n=new FourNonStatic();
		n.add(50, 30);
		n.subtract(false, 2.4);
		n.mul(5);
		
	}

}
