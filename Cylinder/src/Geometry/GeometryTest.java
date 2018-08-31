package Geometry;

public class GeometryTest {
    public static void main(String[]args){

        Cylinder cyl[] = new Cylinder[4];

        for ( int i=0; i<cyl.length; i++) {
            cyl[i]=new Cylinder();

            cyl[i].process();
        }

    }
}
