package Class1;

public class Nonstaticmethod 
{

	
	void add()
	{
		int a=10;
		int b=20;
		int sum=(a+b);
		System.out.println(sum);
	}
	
	void mul()
	{
		int a=3;
		int b=4;
		int mul=(3*4);
		System.out.println(mul);
	}
	
	
	
	public static void main(String[] args) 
	{
		Nonstaticmethod n=new Nonstaticmethod ();
		n.add();
		n.mul();
		
		
	}

}
