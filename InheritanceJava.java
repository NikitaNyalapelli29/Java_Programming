
class Base{
    int x; 
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public Base(){
        System.out.println("Im a Base constructor");
    }
}
class Derived extends Base{
    int y;
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }
    public Derived(){
        System.out.println("Im a Derived constructor");
    }
}
class Derived2 extends Derived{
    Derived2(){
        System.out.println("I am a Derived2 constructor");
    }
}
public class InheritanceJava
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        Base b1 = new Base();
        Derived b = new Derived();
        Derived2 d = new Derived2();
        b.setX(5);
        System.out.println(b.getX());
	}
}
