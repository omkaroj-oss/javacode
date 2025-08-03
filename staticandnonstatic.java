package Class1;

public class staticandnonstatic 
{

	static void add()
	{
		int a=50;
		int b=40;
		int add=(a+b);
		System.out.println(add);
		
	}
	
	void sub()
	{
		int a=50;
		int b=30;
		int sub=(a-b);
		System.out.println(sub);
	}
	
	public static void main(String[] args) 
	{
		
      add ();
      
      staticandnonstatic n=new staticandnonstatic ();
      n.sub();
      
      
	}

}
