/**
 * Created by kijedi on 3/13/18.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class arraytest {

        public static void main (String[] args){

            ListIterator<String> litr = null;
            List<String> names = new ArrayList<>();
            names.add("Shyam");
            names.add("Rajat");
            names.add("Paul");
            names.add("Tom");
            names.add("Kate");
            //Obtaining list iterator
            litr=names.listIterator();

            System.out.println("Traversing the list in forward direction:");
            while(litr.hasNext()){
                System.out.println(litr.next());
            }
            System.out.println("\nTraversing the list in backward direction:");
            while(litr.hasPrevious()){
                System.out.println(litr.previous());
            }
    }


}
