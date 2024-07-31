/*
1. 
Accept  i/ps from User , till user enters "5" or any other option.
I/P : operation(add|sub|mult|div : 1 | 2|3|4) , number1(double) , number2(double) 
Display the result of the operation.
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		
		while(!exit){
		    System.out.println("Choose options:\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Exit");
		    int n = sc.nextInt();
		    double num1, num2;
		    switch(n){
		        case 1:
		            System.out.println("Enter two numbers: ");
		            num1 = sc.nextDouble();
		            num2 = sc.nextDouble();
		            System.out.printf("Addition of %.2f and %.2f: %.2f",num1,num2,(num1+num2));
		            System.out.println();
		            break;
		            
		        case 2:
		            System.out.println("Enter two numbers: ");
		            num1 = sc.nextDouble();
		            num2 = sc.nextDouble();
		            System.out.printf("Substraction of %.2f and %.2f: %.2f",num1,num2,(num1-num2));
		            System.out.println();
		            break;
		            
		        case 3:
		            System.out.println("Enter two numbers: ");
		            num1 = sc.nextDouble();
		            num2 = sc.nextDouble();
		            System.out.printf("Multiplication of %.2f and %.2f: %.2f",num1,num2,(num1*num2));
		            System.out.println();
		            break;
		            
		        case 4:
		            System.out.println("Enter two numbers: ");
		            num1 = sc.nextDouble();
		            num2 = sc.nextDouble();
		            System.out.printf("Division of %.2f and %.2f: %.2f",num1,num2,(num1/num2));
		            System.out.println();
		            break;
		            
		        case 5:
		            exit = true;
		            break;
		    }
		}
		
	}
}
