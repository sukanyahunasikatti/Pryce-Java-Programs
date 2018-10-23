package Array1;z/*6) Take an array as input to a method. Return the second biggest
number as output from the method.*/


public class Ary6 {

	public static void main(String[] args) {
		int []a= {10,2,045,36,75,};
		int big=biggestVal(a);
		System.out.println("The second iggesr =" + big);
	}

	private static int biggestVal(int[] a) {
		
		Arrays.sort(a);

		int aBig=(a.length-2);

			return a[aBig];	}
	

}
