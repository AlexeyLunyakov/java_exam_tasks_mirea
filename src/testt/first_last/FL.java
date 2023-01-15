package testt.first_last;

public class FL {
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
        public void print_arr() {
            ListNode cur = begin;
            while (cur != null) {
                System.out.println(cur.data);
                cur = cur.next;
            }
        }
        public void first_last() {
            ListNode tmp1 = new ListNode(begin.data);
            last.next = tmp1;
            last = tmp1;
            begin = begin.next;
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

    public static void main(String[] tmps) {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        list.print_arr();
        list.first_last();
        list.print_arr();
    }
}
