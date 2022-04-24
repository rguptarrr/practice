package arrays;

import java.util.HashMap;
import java.util.Map;

public class Majorityelement {
    static int majorityElement(int a[], int size)
    {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i : a){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> i : m.entrySet()){
            if(i.getValue()>size/2) return i.getKey();
        }
        return -1;
    }
}
