package string;

public class Task2 {

	public static void main(String[] args) {
		String s="Computer";
		int count=0;
		System.out.println("The vowels are:");
		for(int i=0; i<s.length();i++) {
			char ch = Character.toLowerCase(s.charAt(i));
			if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u') {
				count++;
				System.out.println(ch+" ");
				
			}
		}
		System.out.println("No of vowels=" +count);
		

	}

}
