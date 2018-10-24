
public class C {



	public static void main(String[] args) {
System.out.println(" from main ");
int i=test();
int j=i + test();
System.out.println("i= " +i);
System.out.println("j= " +j);

	}
	public static int test()
	{
		System.out.println("from test");
		return 100;
		
	

}

}



