package testt.reverse_half;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_half {
    public static void reverseHalf(Queue<Integer> q){
        int size = q.size();
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < size; i++){
            int n = q.remove();
            s.push(n);
            q.add(n);
        }

        for(int i = 0; i < size; i++){
            int n = q.remove();
            if(i % 2 == 0){
                q.add(n);
            }
        }

        for(int i = 0; i < size; i++){
            int n = s.pop();
            if(i % 2 == 0)
                q.add(n);
        }

        for(int i = 0; i < size; i++){
            int n = q.remove();
            s.push(n);
            q.add(n);
        }

        for(int i = (size / 2); i < size; i++){
            q.remove();
        }

        for(int i = 0; i < (size / 2); i++){
            s.pop();
        }

        for(int i = 0; i < size / 2; i++){
            q.add(s.pop());
        }

        s.clear();

        for(int i = 0; i < size; i++){
            int n = q.remove();
            s.push(n);
            q.add(n);
        }

        for(int i = 0; i < (size  / 2); i++){
            int n = s.pop();
            int m = q.remove();
            q.add(n);
            q.add(m);
        }

        for(int i = 0; i < (size / 2); i++) {
            q.remove();
        }

    }

    public static void main(String[] args) {
        Queue<Integer> new_q = new LinkedList<>();
        new_q.add(1);
        new_q.add(8);
        new_q.add(7);
        new_q.add(2);
        new_q.add(9);
        new_q.add(18);
        new_q.add(12);
        new_q.add(0);
        System.out.println(new_q);
        reverseHalf(new_q);
        System.out.println(new_q);
    }
}
