package Class1;

public class ThreeNonStatic 
{
     void add()
    {
    	int a=20;
    	int b=10;
    	System.out.println(a+b);
    }
     
     void sub()
     {
     	int a=20;
     	int b=10;
     	System.out.println(a-b);
     }
     
     void mul()
     {
     	int a=20;
     	int b=10;
     	System.out.println(a*b);
     }
	
	public static void main(String[] args) 
	{
		ThreeNonStatic n=new ThreeNonStatic();
		n.add();
		n.sub();
		n.mul();
   
	}

}
