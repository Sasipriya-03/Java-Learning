package oops;
class Student{
	String name;
	int age;
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}


public class Task2 {

	public static void main(String[] args) {
		Student s=new Student();
		s.name="Sasi";
		s.age=21;
		s.display();

	}

}
