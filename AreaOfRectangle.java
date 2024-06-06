package Classwork;
import java.util.*;
public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length Value: ");
		float len = sc.nextFloat();
		System.out.print("Enter breadth Value: ");
		float brea = sc.nextFloat();
		sc.close();
		
		System.out.print("Area of Rectangle: "+(len*brea));
	}

}
