
public class D
{

	public static void main(String[] args) 
	{
		System.out.println(" from main ");
		int i=test();
		int j=i + test();
		int k=i+test()+j+test();
		System.out.println("i= " +i);
		System.out.println("j= " +j);
		System.out.println("k= " +k);
		System.out.println(test());


	}
	
	
		public static int test()
		{
			System.out.println("from test");
			return 100;
		}

}





