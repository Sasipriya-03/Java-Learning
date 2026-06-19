package function;
class Capital{
	void Capital(char ch) {
		if(ch>='A' && ch<='Z')
			System.out.println("Capital Letter");
		else
			System.out.println("Small Letter");
		
	}
}

public class Task7 {

	public static void main(String[] args) {
		Capital c=new Capital();
		c.Capital('s');
		

	}

}
