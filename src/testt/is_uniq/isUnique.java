package testt.is_uniq;

import java.util.*;

public class isUnique {
    public static boolean is_Unique(Map<String, String> u_map) {
        Map<String, String> second = new HashMap<>();
        for(Map.Entry<String, String> entry : u_map.entrySet()) {
            second.put(entry.getValue(), entry.getKey());
        }
        return u_map.size() == second.size();
    }

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        // {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
        map1.put("Marty", "Stepp");
        map1.put("Stuart", "Reges");
        map1.put("Jessica", "Miller");
        map1.put("Amanda", "Camp");
        map1.put("AIsdf", "Reges");
        System.out.println(is_Unique(map1));

    }
}
