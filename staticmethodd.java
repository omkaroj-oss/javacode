package Class1;

public class staticmethodd {
	
	static void add ()
    {
    	int a=30;
    	int b=30;
    	int add=a+b;
    	System.out.println(add);
    }

	static void sub ()
	{
		int c=40;
		int d=20;
		int sub=c-d;
		System.out.println(sub);
	}
	
	void div()
	
	{
		int e=40;
		int f=2;
		int div=e/f;
		System.out.println(div);
		
	}
	public static void main(String[] args) 
	{
add ();
sub();
staticmethodd n=new staticmethodd();
n.div();


	}

}
