package mixprogram;

import java.util.Scanner;

public class replace0with1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		String str = Integer.toString(num);
		String resultnum = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '0') {
				resultnum += '1';
			}
			else {
				resultnum += str.charAt(i);
			}
		}
		System.out.println("Converted number is : " +resultnum);
	}
}