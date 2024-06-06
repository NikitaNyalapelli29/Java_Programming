package Classwork;
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius Value: ");
		float radius = sc.nextFloat();
		System.out.print("Area os Circle: "+(3.14*radius*radius));
		sc.close();
	}

}
