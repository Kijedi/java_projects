import java.util.Scanner;

/**
 * Created by kijedi on 10/3/17.
 */
public class coordinateSystem {
    Point ptStart;
    Point ptEnd;

    Point getThePoint() {
        Scanner input = new Scanner(System.in);
        Point pt = new Point();

        System.out.println("Enter the x coordinate");
        pt.x = input.nextInt();
        System.out.println("Enter the y coordinate");
        pt.y = input.nextInt();

        return pt;
            }
        }

