package Class1;

public class ThreeStaticMethod 
{
	
	static void add(int a ,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void student (String name)
	{
		System.out.println("Omkar");
	}
	
	static void sub(int c,int d )
	{
		int sub=c-d;
		System.out.println(sub);
	}

	public static void main(String[] args) 
	{
		add (200,300);
		student ("omkar");
		sub(50, 20);
	}

}
