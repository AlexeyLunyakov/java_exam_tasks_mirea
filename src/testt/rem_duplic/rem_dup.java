package testt.rem_duplic;

import java.util.ArrayList;

public class rem_dup {
    public static void removeDuplicates(ArrayList<String> list) {
        for (int i = 1; i < list.size(); i++) {
            if ((list.get(i).equals(list.get(i - 1)))) {
                list.remove(i);
                //теперь нужно вернуться к предыдущему элементу
                // поскольку значения сместились в arraylist после удаления
                i--;
            }
        }
    }
}
