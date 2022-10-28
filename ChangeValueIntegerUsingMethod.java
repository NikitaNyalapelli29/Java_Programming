public class ChangeValueIntegerUsingMethod{
  static void change(int a){
    a=36;
    System.out.println("This is method variable value " + a);
  }
  
  public static void main(String[] args){
    int k = 99;
    change(k);
    System.out.println("This is the main value " + k); // not changed in main value
  }
}
