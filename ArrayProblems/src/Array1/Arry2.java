package Array1;

public class Arry2 {
	
static String str="abcdebcd";
	public static void main(String[] args) {
		System.out.println("length  is  "  +  str.length());
		int c = str.length();
		char[] arr = new char[c];
		for (int i=0;i<c;i++) {
			arr[i] = str.charAt(i);
		}
		
		}

	}

