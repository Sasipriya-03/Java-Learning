package string;

public class Task1 {

	public static void main(String[] args) {
		String s="success";
		char ch='s';
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
			
		}
		System.out.println("No of" +ch +"present is=" +count);
		

	}

}
