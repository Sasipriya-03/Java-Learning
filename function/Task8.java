package function;
class Vowelcheck{
	void isVowel(char ch) {
		if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
	}
}

public class Task8 {

	public static void main(String[] args) {
		Vowelcheck v=new Vowelcheck();
		v.isVowel('A');
		

	}

}
