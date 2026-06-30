package oops;
class Car{
	String make;
	String model;
	int year;
	void display() {
		System.out.println("Make:"+make);
		System.out.println("Model:"+model);
		System.out.println("Year:"+year);
		System.out.println();
	}
}

public class Task3 {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.make="Toyota";
		car1.model="Corolla";
		car1.year=2020;
		
		
		Car car2=new Car();
		car2.make="Honda";
		car2.model="City";
		car2.year=2023;
		
		System.out.println("Car1 Details:");
		car1.display();
		System.out.println("Car2 Details:");
		car2.display();
		

	}

}
