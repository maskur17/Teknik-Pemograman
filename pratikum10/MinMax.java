public interface MinMax <T extends Comparable<T>> {
    T max();
}

class Myclass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    Myclass(T[] o){
        vals = o;
    }
    public T max(){
        T v = vals[0];
        for (int i = 1; i < vals.length; i++){
            if (vals[i].compareTo(v) > 0){
                v = vals[i];
            }
        }
        return v;
    }
    public T min(){
        T v = vals[0];
        for (int i = 1; i < vals.length; i++){
            if (vals[i].compareTo(v) > 0){
                v = vals[i];
            }
        }
        return v;
    }
}
