
public class K {



	public static float test(boolean b, int i,char j, int k) 
	{
		
		System.out.println("from test");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(b);
		return 200.44f; // we should write the return values for the double



	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("from maiin ");
	test(false,20,'b',30);
	System.out.println("end of the main");
	
	System.out.println(test(true,30,'c',40));



	}

}
