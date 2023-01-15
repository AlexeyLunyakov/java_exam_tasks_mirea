package testt.reverse;

import java.util.HashMap;
import java.util.Map;

public class rev_map {
    public static void main(String[] tmp) {
        Map<Integer, String> first = new HashMap<>();
        first.put(1, "wejr");
        first.put(2, "erwe");
        first.put(3, "dsfs");
        Map<String, Integer> second = new HashMap<>();
        for(Map.Entry<Integer, String> entry : first.entrySet()) {
            second.put(entry.getValue(), entry.getKey());
        }
        System.out.println(second);
    }
}
/*
public static Map<String, Integer> reverse(Map<Integer, String> map){
    Map<String, Integer> reverseMap =new HashMap<String, Integer>();
    for(Integer key: map.keySet()){
       reverseMap.put(map.get(key),  key);
    }
     return reverseMap;
}
*/