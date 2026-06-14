package array;

public class Task5 {

	public static void main(String[] args) {
		int arr[]= {23,56,89,56,10,23};
		System.out.println("find the duplicate element in the array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
