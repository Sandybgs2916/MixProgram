package mixprogram;

import java.util.Arrays;
import java.util.Scanner;

public class stringanagramcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String str1 = sc.next();
		System.out.println("Enter second string: ");
		String str2 = sc.next();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		// check if length is same
		if(str1.length() != str2.length()) {
			System.out.println(str1 + " and " + str2 + " are not anagram.");
		}
	
		// convert strings to char array
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		// sort the char array
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		boolean result = Arrays.equals(charArray1, charArray2);
		if(result) {
			System.out.println(str1 + " and " + str2 + " are anagram.");
		}
		else {
			System.out.println(str1 + " and " + str2 + " are not anagram.");
		}
}
}