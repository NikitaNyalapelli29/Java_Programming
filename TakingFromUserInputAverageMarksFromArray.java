import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num how many elements you want to store: ");
        int num =  sc.nextInt();
        int [] marks=new int[num];
        float sum=0f;
       
        System.out.println("Enter elements: ");
        for(int i=0;i<num;i++){
                marks[i] = sc.nextInt();
            }
        for(int i:marks) {
            System.out.print(i +" ");
        }
        for(int i:marks){
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Sum of all marks "+sum);
        System.out.println("Average of marks is "+ sum/marks.length);


        }
    }




