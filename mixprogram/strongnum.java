package mixprogram;

import java.util.Scanner;

public class strongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int total = 0;
		int temp_n = n;
		while(n != 0) {
			int fact = 1;
			int i = 1;
			int rem = n % 10;
			while(i <= rem) {
				fact = fact * i;
				i++;
			}
			total += fact;
			n = n/10;
		}
		if(total == temp_n) {
			System.out.println(temp_n + " is a strong number");
		}
		else {
			System.out.println(temp_n + " is not a strong number");
		}
	}
}