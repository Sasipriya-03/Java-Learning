package string;

public class Task6 {

	public static void main(String[] args) {
		String s="Malayalam";
		char c[]=s.toCharArray();
		String s1="";
		for(int i=0;i<c.length;i++) {
			s1=c[i]+s1;
		}
		System.out.println(s1);
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		

	}

}
