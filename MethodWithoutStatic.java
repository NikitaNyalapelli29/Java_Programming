package basic;

public class Methods {
    
    int mult(int x, int y){
        int z = x * y;
        return z;
    }
    public static void main(String[] args) {

        Methods obj = new Methods();
        p = obj.mult(3,4);
        System.out.println("Sum of 3 and 4 is: "+p);

    }
}
