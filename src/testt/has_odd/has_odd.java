package testt.has_odd;

import java.util.HashSet;
import java.util.Set;

public class has_odd {
    public static boolean hasOdd( Set<Integer> set){
        for(Integer element: set){
            if(element%2 != 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Set<Integer> numberSet = new HashSet<>();
        for(int i = 1; i < 25; ++i) {
            numberSet.add(i);
        }
        System.out.println(hasOdd(numberSet));
    }
}
