/*
Display food menu to user. Assign fixed prices to food items.
User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa 3. Rice 4. Noodles .......10 . Generate Bill ) When user enters 'Generate Bill' option, display total bill & exit.
(Can use System.exit(0) to terminate java app or simply exit=true )

*/
import java.util.Scanner;
public class FoodBillGenerate
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int bill=0;
		while(!exit){
		    System.out.println("Select Your Menu: \n1.Dosa-80 \n2.Idli-40 \n3.Vada Sambhar-60 \n4.Samosa-18 \n5.Kachori-20 \n6.Pohe-25 \n7.Vadapav-17 \n8.Tea-12 \n9.Coffee-25 \n10.Exit");
		    int n = sc.nextInt();
		    if(n==10){
		        exit=true;
		        break;
		    }
		    System.out.println("Quantity: ");
		    int q = sc.nextInt();
		    
		    switch(n){
		        case 1:
		            bill=bill+(80*q);
		            break;
		            
		        case 2:
		            bill=bill+(40*q);
		            break;
		        
		        case 3:
		            bill=bill+(60*q);
		            break;
		            
		        case 4:
		            bill=bill+(18*q);
		            break;
		            
		        case 5:
		            bill=bill+(20*q);
		            break;
		            
		        case 6:
		            bill=bill+(25*q);
		            break;
		            
		        case 7:
		            bill=bill+(17*q);
		            break;
		            
		        case 8:
		            bill=bill+(12*q);
		            break;
		            
		            
		        case 9:
		            bill=bill+(25*q);
		            break;
		            
		        default:
		            System.out.println("Invalid Choice ");
		    }
		    
		    
		}
		System.out.println("Your total bill: "+bill);
		System.out.println("Thank Your For Visiting ");
		
	}
}
