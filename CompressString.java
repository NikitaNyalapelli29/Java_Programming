public class Main
{
public static String compressString(String str){
        String newStr = "";
        for(int i =0; i<str.length()-1; i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }
  public static void main(String[] args) {
		//System.out.println("Hello World");
		System.out.println(compressString("aaabbccttt"));
	}
}
