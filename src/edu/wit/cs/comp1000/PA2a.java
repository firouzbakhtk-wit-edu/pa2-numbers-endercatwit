package edu.wit.cs.comp1000;
import java.util.Scanner;

/*Cynthia Ender
 * sums and averages
 */
public class PA2a {
	//main function
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter five whole numbers: ");
		int a = input.nextInt();
		int b = input.nextInt(); //it would be better to make this an array,
		int c = input.nextInt(); //but i don't know how
		int d = input.nextInt(); //and you don't want me to
		int e = input.nextInt();
		int smp = 0;
		int smn = 0;
		double avp = 0;
		double avn = 0;
		int cnp = 0;
		int cnn = 0;
		//if there's only one number in a category, you make it singular. if there are none, you print 0
		//print only 2 decimal places - use %.2f
		if (a > 0) {
			smp += a; //whee... can't iterate properly...
			avp += a;
			cnp ++;
		} else {      //arrays? we don't need no arrays
			smn += a;
			avn += a;
			cnn ++;
		}
		if (b > 0) {
			smp += b;
			avp += b;
			cnp ++;
		} else {
			smn += b;
			avn += b;
			cnn ++;
		}
		if (c > 0) {
			smp += c;
			avp += c;
			cnp ++;
		} else {
			smn += c;
			avn += c;
			cnn ++;
		}
		if (d > 0) {
			smp += d;
			avp += d; //this sucks
			cnp ++;
		} else {
			smn += d;
			avn += d;
			cnn ++;
		}
		if (e > 0) {
			smp += e;
			avp += e;
			cnp ++;
		} else {
			smn += e;
			avn += e;
			cnn ++;
		}
		
		if (cnp == 1) {
			System.out.printf("The sum of the 1 positive number: %d%n", smp);
		} else {
			System.out.printf("The sum of the %d positive numbers: %d%n", cnp, smp);
		}
		if (cnn == 1) { //checks in case it needs to singularize
			System.out.printf("The sum of the 1 non-positive number: %d%n", smn);
		} else {
			System.out.printf("The sum of the %d non-positive numbers: %d%n", cnn, smn);
		}
		System.out.printf("The sum of the 5 numbers: %d%n", a+b+c+d+e);
		
		if (cnp == 0) {
			System.out.printf("The average of the 0 positive numbers: 0.00%n");
		} else if (cnp == 1) {
			System.out.printf("The average of the 1 positive number: %.2f%n", avp);
		} else {
			avp = avp / cnp;
			System.out.printf("The average of the %d positive numbers: %.2f%n", cnp, avp);
		}
		if (cnn == 0) { //there are many checks to do
			System.out.printf("The average of the 0 non-positive numbers: 0.00%n");
		} else if (cnn == 1) {
			System.out.printf("The average of the 1 non-positive number: %.2f%n", avn);
		} else {
			avn = avn / cnn;
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", cnn, avn);
		}
		System.out.printf("The average of the 5 numbers: %.2f%n", (0.0+a+b+c+d+e)/5);
		
		input.close();
	}

}
