

package Array1;

public class Array2 {

	public static void main(String[] args) {
		// checking length equals or not
		String s1="abcdgh";
		String s2="abcdgh";
		int len=s1.length();
		System.out.println(s1.equals(s2));
		// prinng all characters in string
		System.out.println("printimg thechracter using tochararray   ");
		for(int i=0;i<s1.length();i++)
		{
			System.out.println("  chat at index  " + i  +  "  is   " +  s1.charAt(i));
			
		}
			//convert string to array of chars and print chars
		char[] ch=s1.toCharArray();
		System.out.println("printing all the chracters of array uing toCharArray()");
		for(int j=0;j<ch.length;j++)
			System.out.println("character at position "+j+" is "+ch[j]);
			
			//convert string to uppercase and lowercase and print
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
// take 2 strings and check if they are equal
		System.out.println((s2.equals(s1))+"length s1:  "+s1.length()+" s2:  "+s2.length());
		
		int x=s1.compareTo(s2);
		if(x==0)
		{
			System.out.println("s1 is  equal tos2");}
			else if(x>0){
			System.out.println("s1 is greter than s2");}
			else
				System.out.println("s2 is greter than s1");
	//take 2 strings and find out if one string occurs in other*
	
	String s6="ramarama";
	   String s7="rama";
	 
	  System.out.println("is "+s7 +" occurs in "+s6+" ?? "+s6.contains(s7));
		
	}
}

