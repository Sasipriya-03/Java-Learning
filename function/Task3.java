package function;
class splitDigits{
	void splitDigits(int num) {
		while(num>0) {
			System.out.println(num%10+" ");
			num/=10;
		}
		
	}
}

public class Task3 {

	public static void main(String[] args) {
		splitDigits s=new splitDigits();
		s.splitDigits(4327);
		
	}

}
