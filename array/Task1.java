package array;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
	    int arr[]=new int[5];
	    int sum=0;
	    System.out.println("Enetr a 5 Elements");
	    for(int i=0;i<5;i++) {
	    	arr[i]=Sc.nextInt();
	    }
	    int largest=0;
	    int smallest=0;
	    for(int i=0;i<5;i++) {
	    	sum=sum+arr[i];
	    	if(arr[i]>largest) {
	    		largest=arr[i];
	    	}
	    	if(arr[i]<smallest) {
	    		smallest=arr[i];
	    	}
	    }
	    System.out.println("Largest=" +largest);
	    System.out.println("Smallest=" +smallest);
	    System.out.println("Sum of Elements=" +sum);
		

	}

}
