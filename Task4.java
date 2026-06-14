package string;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		StringBuilder s=new StringBuilder("beautiful");
		int count =0;
		System.out.println("Reverse String");
		s.reverse();
		for(int i=0;i<s.length();i++) {
			char ch = Character.toLowerCase(s.charAt(i));
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				count++;
				System.out.println(ch+" ");
			}
		}
		System.out.println(s);
		System.out.println("No of vowels=" +count);
		

	}

}
