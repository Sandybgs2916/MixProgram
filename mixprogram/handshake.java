package mixprogram;

import java.util.Scanner;

public class handshake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int total = (n * (n-1))/2;
		System.out.println("For " +n+ " people there will be " +total + " handshakes");
	}
}