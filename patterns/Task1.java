package patterns;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a number of rows and cols....");
		int r=Sc.nextInt();
		int c=Sc.nextInt();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
