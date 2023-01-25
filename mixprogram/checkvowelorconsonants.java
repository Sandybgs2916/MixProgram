package mixprogram;

import java.util.Scanner;

public class checkvowelorconsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().trim().charAt(0);
		if((ch == 'a' || ch == 'e' || ch == 'i' ||  ch == 'o' || ch == 'u')) {
			System.out.println(ch+ " is a vowel");
		}
		else {
			System.out.println(ch+ " is a consonant");
		}
	}
}