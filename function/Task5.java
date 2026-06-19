package function;
class SquareCube{
	void Square(int n) {
		System.out.println("Square: "+(n*n));
	}
	void Cube(int n) {
		System.out.println("Cube: "+(n*n*n));
	}
}

public class Task5 {

	public static void main(String[] args) {
		SquareCube S=new SquareCube();
		S.Square(6);
		S.Cube(5);

	}

}
