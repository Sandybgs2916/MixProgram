package mixprogram;

import java.util.Scanner;

public class checkcharisalphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().trim().charAt(0);
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch+ " is an Alphabet");
		}
		else {
			System.out.println(ch+ " is not an Alphabet");
		}
	}
}