import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

/**
 * wildcard arguments with an unknown type
 * 
 * @author javaguides.net
 */

public class WildCardSimpleExample {
    public static void printCollection(Collection<?> c){
        for (Object e : c){
            System.out.println(e);
        }
    }
    public static void printMap(Map c){
        System.out.println(c);
    }
}
