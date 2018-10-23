package Array1;

public class Arrry3{
public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		double x = 140;
		double res = Math.sqrt(x);

			System.out.println("sqrt of "+x+" = "+res);
			res = Math.cbrt(x);
			System.out.println("cbrt of "+x+" = "+res);
			int y;
			// generate random int values between 1 - 100
			for(int i = 0 ; i < 10 ; i++)
			{
				y = (int) (Math.random() * 100); // 0 - 1
				System.out.println("random "+y);
			}

			int p=(int) Math.pow(2, 3);
			System.out.println("power of "+p);

	}

}