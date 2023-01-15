package testt.remove;

public class remove_all {
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
        public boolean del_elem(int data) {
            if (begin.next == null) return false;
            if (begin.data == data) {
                del_first();
                return true;
            }
            else if (last.data == data) {
                del_last();
                return true;
            }
            ListNode start = begin;
            ListNode after_start = begin.next;
            while(after_start != null && after_start.data != data) {
                after_start = after_start.next;
                start = start.next;
            }
            if (after_start == null) {
                return false;
            }
            start.next = after_start.next;
            return true;
        }
        public void del_first() {
            if (begin.next == null) return;
            begin = begin.next;
        }
        public void del_last() {
            if (begin.next == null) return;
            ListNode cur = begin;
            while (cur.next != last) {
                cur = cur.next;
            }
            last = cur;
            last.next = null;
        }
        public void removeAll(LinkedIntList list2) {
            if (begin.next == null && list2.begin == null) return;
            ListNode cur = list2.begin;
            while(cur != null) {
                if(!del_elem(cur.data)) {
                    cur = cur.next;
                }
            }
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
        LinkedIntList list1 = new LinkedIntList();
        for(int i = 1; i <= 7; i+=2) {
            list1.add(i);
        }
        LinkedIntList list2 = new LinkedIntList();
        for(int i = 1; i <= 5; ++i) {
            list2.add(i);
        }

        list1.removeAll(list2);
        list1.print_arr();
    }

}
