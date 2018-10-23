package Array1;

//*4)Code an add() method that will add all the numbers given and return
//the result (use array of ints as param to the add() method). See
//AddArrayElements.java if you have a doubt.*/

public class Ay4 {

	public static void main(String[] args) {
		int[] a= {};
		int res= add(a);
		System.out.println("The sum of array ="+res);
		
	}
public static int add(int[] a)
{
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
		
	}
	return sum;
}
}
