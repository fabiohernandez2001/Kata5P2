
package kata5p2.model;

import java.util.HashMap;
import java.util.Set;


public class Histogram<T> {
    private final HashMap <T, Integer> map;
    public Histogram(){
        map = new HashMap<T, Integer> ();
    }

    public Integer get(T key) {
        return map.get(key);
    }
    public Set<T> keySet(){
        return map.keySet();
    }
    public void increment(T key){
        map.put(key,map.containsKey(key)? map.get(key)+1:1);
    }
}
