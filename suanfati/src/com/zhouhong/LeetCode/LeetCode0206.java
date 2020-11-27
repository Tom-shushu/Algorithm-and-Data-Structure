package com.zhouhong.LeetCode;

public class LeetCode0206 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pre = null;
            while (head != null){
                ListNode next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            return pre;
        }
    }

}
