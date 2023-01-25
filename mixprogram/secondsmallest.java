package mixprogram;

public class secondsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,13,1,7,10,34};
		int smallest = Integer.MAX_VALUE; // this will give 2147483647
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i]; // this will give 1
			}
		}
		System.out.println("Smallest element is: " +smallest);
		int sec_smallest = Integer.MAX_VALUE;  // again this will give 2147483647
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < sec_smallest && arr[i] > smallest) {
				sec_smallest = arr[i];
			}
		}
		System.out.println("Second smallest element is: " +sec_smallest);
	}
}