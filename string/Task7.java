package string;

import java.util.Arrays;

public class Task7 {

	public static void main(String[] args) {
		String s="race",s1="care";
		char a[]=s.toCharArray();
		char b[]=s1.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a,b)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}

	}

}
