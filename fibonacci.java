public class fibonacci {
    static void fibo(int n){
        
        int first = 0;
        int second = 1;
        int third=0;
        System.out.print(first +" "+second +" ");
        for(int i=1; i<=n-2;i++){
            third = first+second;
            System.out.print(third +" " );
            first = second;
            second = third;

        }
    }

    public static void main(String[] args) {
        fibo(5);
    }
}
