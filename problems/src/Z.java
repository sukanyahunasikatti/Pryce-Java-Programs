
public class Z {
	static int x=10;
	static void test() // static memebers execution is from top to bottom 
	{
		x=20;
	}
	public static void main(String[] args)
	{
		System.out.println("main:" +x);
		test();
		System.out.println("main end:" +x);
		
		
	}
}
