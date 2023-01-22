import project01.Vector3D;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Vector3D a= new Vector3D(1,1,1);
        Vector3D b= new Vector3D(-1,-1,-1);
        a.getX();
        System.out.println(a.toString());
        System.out.println("magnitude is "+a.getMagnitude());
        System.out.println(a.normalize().toString());
        System.out.println(a.add(b.getX(),b.getY(),b.getZ()).toString());
        System.out.println(a.multiply(3).toString());
        System.out.println("the dot is "+a.dotProduct(b.getX(),b.getY(),b.getZ()));
        System.out.println("the angle is "+a.angleBetween(b.getX(),b.getY(),b.getZ()));
        System.out.println(a.crossProduct(b.getX(),b.getY(),b.getZ()));





    }
}