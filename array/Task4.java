package array;

public class Task4 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,10};
		System.out.println("Find the duplicate element in the array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
