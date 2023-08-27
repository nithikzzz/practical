package task2;


public class Calc {
	
	double pi,r,Area;
	String color;
	
	public void calc_circle(Circle C) {
		pi=3.14;
		r=C.getRadius();
		Area= pi * r * r ;
		System.out.print("The Area of the Circle is : " + Area + "\n");
		System.out.print("The Colour of the Circle is : " + C.getColour() );
	}
	

}
