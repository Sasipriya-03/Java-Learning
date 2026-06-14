package array;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int a[]=new int[10];
		int oneDigitSum=0;
		int twoDigitSum=0;
		System.out.println("Enter a 10 integer value....");
		for(int i=0;i<a.length;i++) {
		    a[i]=Sc.nextInt();
			if(a[i]>=0 && a[i]<=9) {
				oneDigitSum +=a[i];
				
			}
			else if(a[i]>=10 && a[i]<=99) {
				twoDigitSum +=a[i];
			}
		}
		System.out.println("Sum of one-digit numbers:" +oneDigitSum);
		System.out.println("Sum of two-digit numbers:" +twoDigitSum);
		

	}

}
