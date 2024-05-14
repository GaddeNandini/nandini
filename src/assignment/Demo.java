package assignment;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		float rad;
		System.out.println("Enter the radius of the sphere:");
		rad=v.nextFloat();
		String colour;
		System.out.println("Enter the colour:");
		colour=v.next();
		Circle c=new Circle();
		c.setRadius(rad);
		c.setColour(colour);
		System.out.println(c);
		CalcArea(rad);
	}
	static void CalcArea(float x) {
		double area;
		area=Math.PI*x*x;
		System.out.println(area);
	}
}
	
