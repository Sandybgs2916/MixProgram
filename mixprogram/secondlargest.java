package mixprogram;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,25,63,96,57};
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second largest number is: " + arr[arr.length-2]);
		for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
}
}