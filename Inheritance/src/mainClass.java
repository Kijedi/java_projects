/**
 * Created by kijedi on 10/3/17.
 */
public class mainClass {
    static coordinateSystem identityCoordinateSystem(){
        coordinateSystem coord = new coordinateSystem();

        System.out.println("Start Point");
        coord.ptStart = coord.getThePoint();
        System.out.println("End Point");
        coord.ptEnd = coord.getThePoint();

        return coord;
    }

    static void show(coordinateSystem c){
        System.out.println("Coordinate System");
        System.out.printf("Starting point (%d,%d)", c.ptStart.x, c.ptStart.y);
        System.out.println();
        System.out.printf("Starting point (%d,%d)", c.ptEnd.x, c.ptEnd.y);
    }

    public static void main(String[] args){
        coordinateSystem coord = identityCoordinateSystem();
        show(coord);
    }
}
