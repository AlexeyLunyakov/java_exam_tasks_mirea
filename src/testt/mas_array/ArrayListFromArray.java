package testt.mas_array;

public class ArrayListFromArray <E>{
    private E[] myList;
    private int size = 0;

    ArrayListFromArray(int element){
        size = element;
        myList = (E[]) new Object[size];
    }

    ArrayListFromArray(E element){
        size = 1;
        myList = (E[]) new Object[size];
        myList[0] = element;
    }

    ArrayListFromArray(E[] elements){
        size = elements.length;
        myList = elements;
    }
    public void add(E element){
        size++;
        E[] tmp = myList;
        myList = (E[]) new Object[size];
        if (size - 1 >= 0) System.arraycopy(tmp, 0, myList, 0, size - 1);
        myList[size - 1] = element;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; ++i)
            str.append(myList[i]).append(" ");
        return str.toString();
    }

    public static void main(String[] args) {
        Integer [] check = new Integer[]{1, 2};
        ArrayListFromArray<Integer> example = new ArrayListFromArray<>(check);
        example.add(2);
        System.out.println(example);
    }
}