package string;

public class Task5 {

	public static void main(String[] args) {
		String s="Sasi";
		String s1=" ";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
        System.out.println(s1);
	}

}
