package testt.reg_sum;

public class reg_sum {
    public static void func(Integer num, Integer summa) {
        if(num != 0) {
            summa += num % 10;
            func(num/10, summa);
        }
        else System.out.println(summa);
    }

    public static void main(String[] args) {
        Integer N = 1123;
        System.out.println("Result: ");
        func(N, 0);
    }
}
