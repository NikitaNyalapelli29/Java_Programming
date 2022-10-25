
public class Array2 {
    public static void main(String[] args) {
        // calculate the average marks from an array containing marks of all
        // students using for-each loop
       
        int[] marks = {78,77,97,99,59,79,90,88};
        float sum = 0f;
        for(int i:marks){
            sum = sum + i;

        }
        System.out.println("Sum of marks is "+ sum);
        System.out.println("Average of marks is " + sum/marks.length);

    }



}
