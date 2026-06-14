package array;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a number of Students...");
		int n=Sc.nextInt();
		int roll[]=new int[n];
		String name[]=new String[n];
		int mar1[]=new int[n];
		int mar2[]=new int[n];
		int mar3[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter  a Roll no");
			roll[i]=Sc.nextInt();
			System.out.println("Enter a name");
			name[i]=Sc.next();
			System.out.println("Ente a mark1");
			mar1[i]=Sc.nextInt();
			System.out.println("Ente a mark2");
			mar2[i]=Sc.nextInt();
			System.out.println("Ente a mark3");
			mar3[i]=Sc.nextInt();
		}
		System.out.println("Enter a Students details");
		for(int i=0;i<n;i++) {
			double avg=(mar1[i]+mar2[i]+mar3[i]);
			String remark;
			if(avg>=85)
				remark="EXCELLENT";
			else if(avg>=75)
				remark="DISTINCTION";
			else if(avg>=60)
				remark="FIRST CLASS";
			else if(avg>=40)
				remark="PASS";
			else
				remark="POOR";
			System.out.println(roll[i]+" "+name[i]+"Avg="+avg+" "+remark);
				
		}
		

	}

}
