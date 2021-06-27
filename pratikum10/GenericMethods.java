import java.util.Random;
import java.util.*;

public class GenericMethods {
    //Java Generic Method
    public static <T> boolean isEqual (GenericType<T> g1, GenericType<T> g2){
        return g1.get().equals(g2.get());
    }
    //generic for random pick element in array
    public static <T> T getRandom(T[] t){
        int rnd = new Random().nextInt(t.length);
        return t[rnd];
    }
    public static Object getKeyFromValue(Map hm, Object value){
        for (Object o : hm.keySet()){
            if(hm.get(o) == value){
                return o;
            }
        }
        return null;
    }
}
