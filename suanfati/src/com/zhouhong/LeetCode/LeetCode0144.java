package com.zhouhong.LeetCode;

public class LeetCode0144 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode insertionSortList(ListNode head) {
        int count = 0;
        while (head != null){
            head = head.next;
            count++;
        }
        /**
         * TODO
         */



        return head;
    }
}
