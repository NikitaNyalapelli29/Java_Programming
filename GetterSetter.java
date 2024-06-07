// learned how to access private variable using getters and setters

class Cylinder{
    private int radius;
    private int height;
    
    public void setRadius(int r){
        radius = r;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public double surfaceArea(){
        return 2*3.14*radius*height+2*3.14*radius*radius;
    }
}
public class GetterSetter
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        Cylinder c = new Cylinder();
        
        c.setRadius(3);
        c.setHeight(5);
        System.out.println("Cylinder Radius: "+c.getRadius());
        System.out.println("Cylinder Height: "+c.getHeight());
        System.out.println("Surface Area of Cylinder: "+c.surfaceArea());
	}
}
