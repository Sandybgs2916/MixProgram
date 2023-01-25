package mixprogram;

import java.util.Scanner;

public class returnelementsumofodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int [] arr = new int[5];
			System.out.println("Enter Input: ");
			for(int i = 0; i < 5; i++) {
				arr[i] = sc.nextInt();
			}
			for(int i = 0; i < 5; i++) {
				int num = arr[i];
				int ans = 0;
			while(num > 0) {
				int rem = num % 10;
				num = num / 10;
				ans += rem;
			}
			if(ans % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
			else {
			  continue;
			}
			}
		}
	}