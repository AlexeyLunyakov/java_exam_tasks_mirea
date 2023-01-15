package testt.split_stack;

import java.util.Stack;
public class SplitingStack {
    public static class LinkedIntList {
        ListNode begin;
        ListNode last;

        LinkedIntList() {
            this.begin = null;
            this.last = null;
        }
        public void add(int data) {
            ListNode tmp = new ListNode(data);
            if (begin == null) {
                begin = tmp;
                last = tmp;
                return;
            }
            last.next = tmp;
            last = tmp;
        }
    }
    public static class ListNode {
        public int data;
        public ListNode next;
        ListNode(int data) {
            this.data = data;
            next = null;
        }
    }
    public static Stack<Integer> splitstack(Stack<Integer> current){
        LinkedIntList tmp = new LinkedIntList();
        while (!current.isEmpty())
            tmp.add(current.pop());
        ListNode currentNode = tmp.begin;
        while (currentNode != null){
            if (currentNode.data < 0)
                current.add(currentNode.data);
            currentNode = currentNode.next;
        }
        currentNode = tmp.begin;
        while (currentNode != null){
            if (currentNode.data >= 0)
                current.add(currentNode.data);
            currentNode = currentNode.next;
        }
        return current;
    }

    public static void main(String[] args) {
        Stack<Integer> current = new Stack<>();
        for (int i = 1; i <= 4; ++i){
            if (i % 2 == 0)
                current.add(i * -1);
            else current.add(i);
        }
        System.out.println(SplitingStack.splitstack(current));
    }
}