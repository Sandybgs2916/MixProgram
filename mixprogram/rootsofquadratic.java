package mixprogram;

import java.util.Scanner;

public class rootsofquadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		double a = sc.nextDouble();
		
		System.out.println("Enter the value of b: ");
		double b = sc.nextDouble();
		
		System.out.println("Enter the value of c: ");
		double c = sc.nextDouble();
		
		double determinant = (b*b)-(4*a*c);
		double sqroot = Math.sqrt(determinant);
		
		if(determinant > 0) {
			double firstroot = (-b + sqroot)/(2*a);
			double secondroot = (-b - sqroot)/(2*a);
			System.out.println("Roots are:" + firstroot + " and "+secondroot);
		}
		else if(determinant == 0) {
			double firstroot = (-b + sqroot)/(2*a);
			double secondroot = (-b + sqroot)/(2*a);
			System.out.println("Roots are:" + firstroot + " and "+secondroot);	
		}
		else {
			System.out.println("Roots are imaginary"); 
		}
	}
}
