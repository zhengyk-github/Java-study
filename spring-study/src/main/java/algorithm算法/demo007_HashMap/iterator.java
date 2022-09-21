package algorithm算法.demo007_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class iterator {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"zyk1");
        map.put(2,"zyk2");
        map.put(3,"zyk3");
        map.put(4,"zyk4");
        map.put(5,"zyk5");
        map.put(6,"zyk6");

        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> map1 = iterator.next();
            System.out.println(map1.getKey()+":"+map1.getValue());
        }


        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + "\t");
        }
    }
}
