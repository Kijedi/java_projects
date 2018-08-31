package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kijedi on 10/18/17.
 */
public class DateEx {

    public static void main(String args[]){

        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        int y = Integer.parseInt(formatter.format(today));

        System.out.print(y-1997);
    }
}
