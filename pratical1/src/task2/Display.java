package task2;

import java.util.Scanner;

public class Display {

	
	public static void main(String[] args) {
		int ra;
		String co;
		Scanner O = new Scanner(System.in);
		System.out.print("Enter the Radius of the Circle : ");
		ra=O.nextInt();
		System.out.print("Enter the Colour of the Circle : ");
		co=O.next();
		
		Circle C = new Circle();
		C.setRadius(ra);
		C.setColour(co);
		
		Calc ca = new Calc();
		ca.calc_circle(C);
		
		
	}
}
