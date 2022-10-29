public class RecursionFactorial{
  int factorial(int a){
    if (a==0 || a==1){
      return 1;
    }
    else{
      return (a*(factorial(a-1)));
    }
  }
  public static void main(String[] args){
    // calling function by creating object
    RecursionFactorial obj = new RecursionFactorial();
    int x=obj.factorial(4);
    System.out.print("Factorial value is: " + x);
    
  }
}
