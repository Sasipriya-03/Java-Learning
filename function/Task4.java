package function;
import java.util.Scanner;

class Armstrong {
    void printArmstrong(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if (sum == num)
            System.out.println(num + " is Armstrong Number");
        else
            System.out.println(num + " is Not Armstrong Number");
    }
}

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number...");
        int num = sc.nextInt();

        Armstrong a = new Armstrong();
        a.printArmstrong(num);

        sc.close();
    }
}