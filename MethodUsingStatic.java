package basic;

public class Methods {
    static int sum(int a, int b){
        int ans = a+b;
        return ans;
    }
    static int mult(int x, int y){
        int z =x*y;
        return z;
    }
    public static void main(String[] args) {
        int p=sum(3,4);
        System.out.println(p);
        int k = mult(2,6);
        System.out.println(k);

    }
}
