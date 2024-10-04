package edu.wit.cs.comp1000;
import java.util.Scanner;
/*Cynthia Ender
 * finds roots of quadratic equations
 */
public class PA2b {

	//main function
	public static void main(String[] args) {
		//remember, roots are found using (-b plus or minus sqrt(d))/2a
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a b c: ");
		double a = input.nextDouble(); //takes input
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = (b * b) - (4* a * c); //finds the discriminant
		if (d < 0) {
			System.out.printf("Roots: imaginary%n");
			System.exit(0);
		} else if (d == 0) {
			System.out.printf("Root: %.2f%n", (0.0 - b)/(2 * a));
		} else {
			System.out.printf("Roots: %.2f, %.2f%n", (0.0 - b - Math.sqrt(d))/(2 * a), (0.0 - b + Math.sqrt(d))/(2 * a));
		} //that one's long, it finds the roots
		input.close();
	}

}
