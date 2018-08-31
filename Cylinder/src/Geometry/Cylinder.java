package Geometry;
import java.util.Scanner;

/**
 * Created by koggy on 10/12/17.
 */
public class Cylinder {

    void process(){
        Scanner scanner=new Scanner(System.in);
        double radius=0, height=0,baseArea,lateralArea,totalArea,volume;

        System.out.println("Enter the dimensions of the cylinder: ");
        System.out.println("Radius>");
        radius=scanner.nextDouble();

        System.out.println("Height>");
        height=scanner.nextDouble();

        baseArea=radius*radius*3.142159;
        lateralArea=2*3.142159*radius*height;
        totalArea=2*3.142159*radius*(height+radius);
        volume=3.142159*radius*radius*height;

        System.out.println("\nCylinder Characteristics");
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
        System.out.printf("Base: %f\n", baseArea);
        System.out.printf("Lateral: %f\n", lateralArea);
        System.out.printf("Total: %f\n", totalArea);
        System.out.printf("Volume: %f\n", volume);
    }
}
/*class Main{
    public  static void main(String []args){
        Cylinder cyl=new Cylinder();

        cyl.process();

    }

}*/