package testt.long_seq;

public class LSS {
    public static int getMaxLength(int[] values) {
        int maxL = 1;
        int cur_L = 1;
        for(int i = 1; i < values.length; ++i) {
            if(values[i] > values[i-1])
                cur_L++;
            else {
                maxL = Integer.max(maxL, cur_L);
                cur_L = 1;
            }
        }
        return Integer.max(maxL, cur_L);
    }
    public static void main(String[] args) {
        int[] list = new int[]{1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17};
        System.out.println(getMaxLength(list));
    }
}
