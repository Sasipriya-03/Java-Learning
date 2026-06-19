package function;
class Mathfunction{
	void square(int a) {
		System.out.println("Square= "+(a*a));
		
	}
	void cube(int b) {
		System.out.println("Cube= "+(b*b*b));
	}
}

public class Task2 {

	public static void main(String[] args) {
		 Mathfunction m=new  Mathfunction();
		 m.square(5);
		 m.cube(5);

	}

}
