package mixprogram;

import java.util.Scanner;

public class sort1sthalfascend2nddescend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {3,2,4,1,10,30,40,20};
		int n = a.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n/2; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			for(int j = n/2; j < n-1; j++) {
				if(a[j] < a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		} 
	}
} 