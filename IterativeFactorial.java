public class IterativeFactorial{
  int factorial(int a){
    int product = 1;
    if (a==0){
      return 1;
    }
    else{
      for(int i=1; i<=a; i++){
        product *= i;
      }
      return product;
    }
  }
  public static void main(String[] args){
    IterativeFactorial obj = new IterativeFactorial();
    int val = obj.factorial(4);
    System.out.println(val);
  }
}
