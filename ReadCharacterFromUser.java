import java.util.Scanner;
public class ReadCharacterFromUser
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner object 
		System.out.print("Enter Character: ");
		char c = sc.next().charAt(0);   // taking user input 
		System.out.println("You entered Character is: "+c); // printing first character
	}
}
