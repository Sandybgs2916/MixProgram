package mixprogram;

import java.util.Scanner;

public class checkperfectsquare {
	public static boolean isPerfectSquare(int n) {
		if(n >= 0) {
			int sr = (int)Math.sqrt(n);
			return ((sr * sr) == n);
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if (isPerfectSquare(n)) {
			System.out.println(n + " is a perfect square");
		}
		else {
			System.out.println(n + " is not a perfect square");
		}
	}
}