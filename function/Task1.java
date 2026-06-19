package function;
class Sequencet1{
	void series1() {
		for(int i=2;i<=16;i+=2) {
			System.out.println(i+" ");
		}
	}
	void series2() {
		for(int i=50;i>=0;i-=10) {
			System.out.println(i+" ");
		}
	}
}
public class Task1 {

	public static void main(String[] args) {
		Sequencet1 s=new Sequencet1();
		System.out.println("Series1:");
		s.series1();
		System.out.println("\n Series2:");
		s.series2();
		
		
	}

}
