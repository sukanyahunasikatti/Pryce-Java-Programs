
public class A {

	public static void main(String[] args) {
System.out.println("main begin");
test();
System.out.println("main end");
System.out.println(test()); // if the method inside the sop
//that method return value will be printing at d last..

	}
	public static int test()
	{
		System.out.println("from test");
		return 100;
		
	}

}
