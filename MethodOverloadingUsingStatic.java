public class MethodOverloadingUsingStatic{
  static void GreetingMessage(){
    System.out.println("Hii, Welcome to my github account!");
  }
  static void GreetingMessage(String name){
    System.out.println("Hii "+name+", Welcome to my github account!");
  }
  
  public static void main(String[] args){
    GreetingMessage();
    GreetingMessage("Nikita");
  }
}
