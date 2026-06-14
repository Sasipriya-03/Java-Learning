package patterns;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a number......");
		int r=Sc.nextInt();
		int c=Sc.nextInt();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==0 || i==r-1 || j==0 || j==c-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
