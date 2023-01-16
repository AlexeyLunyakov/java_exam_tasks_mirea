package testt.guavaSort;

import java.util.*;
import java.util.Collection;

public class Guava_sort {
    public static void main(String[] args) {
        String[] massive = {"Farm", "Zoo", "Car", "Apple", "Bee","Golf", "Bee", "Dog", "Golf", "Zoo", "Zoo", "Bee", "Bee", "Apple"};
        guavaSort(massive);
    }
    private static void guavaSort(String[] mas){
        int Ap = 0, Be = 0, Ca = 0, Do = 0, Gol = 0, Zoo = 0;
        Map<String, Integer> FirstMap = new HashMap<>();
        FirstMap.put("Apple", 0);
        FirstMap.put("Bee", 0);
        FirstMap.put("Car", 0);
        FirstMap.put("Dog", 0);
        FirstMap.put("Golf", 0);
        FirstMap.put("Zoo", 0);
        /*Set<String> keys = FirstMap.keySet();
        Collection<Integer> values = FirstMap.values();*/
        for (int i=0; i != mas.length; i++){
            if(Objects.equals(mas[i], "Apple")){
                Ap += 1;
                FirstMap.replace("Apple", Ap);
            }
            else if(Objects.equals(mas[i], "Bee")){
                Be +=1;
                FirstMap.replace("Bee", Be);
            }
            else if(Objects.equals(mas[i], "Car")){
                Ca +=1;
                FirstMap.replace("Car", Ca);
            }
            else if(Objects.equals(mas[i], "Dog")){
                Do += 1;
                FirstMap.replace("Dog", Do);
            }
            else if(Objects.equals(mas[i], "Golf")){
                Gol += 1;
                FirstMap.replace("Golf", Gol);
            }
            else if(Objects.equals(mas[i], "Zoo")){
                Zoo += 1;
                FirstMap.replace("Zoo", Zoo);
            }
        }
        for( Map.Entry<String, Integer> entry : FirstMap.entrySet() )
        {
            String key = entry.getKey();
            Collection<Integer> values = Collections.singleton(entry.getValue());

            System.out.print("Key = " + key);
            System.out.println(" , Values = " + values );
        }
        Arrays.sort(mas);
        for (String elem : mas) {
            System.out.println(elem + " ");
        }
    }
}
