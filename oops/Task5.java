package oops;
interface Animal{
	void makeSound();
}
class Dog implements Animal{
	public void makeSound() {
		System.out.println("Dog Say:Bark");
	}
	
}
class Cat implements Animal{
	public void makeSound() {
		System.out.println("Cat Say:Meow");
	}
}
class Cow implements Animal{
	public void makeSound() {
		System.out.println("Cow say:Moo");
	}
}
public class Task5 {

	public static void main(String[] args) {
		Dog d=new Dog();
		Cat c=new Cat();
		Cow w=new Cow();
		d.makeSound();
		c.makeSound();
		w.makeSound();
		

	}

}
