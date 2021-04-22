package com.fenng.algorithms.leetcode;

/**
 * 206. Reverse Linked List
 * https://leetcode.com/problems/reverse-linked-list/
 *
 * 注意 空节点和一个节点的情况 例如 [] [1]
 *
 */
public class ReverseLinkedList {
    // 入口函数
    public static void main(String[] arg) {
        ReverseLinkedList rln = new ReverseLinkedList();

        rln.invokReverseList();
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        else if (head.next == null) return head;

        ListNode p1, p2 = null;
        p1 = head;

        while (head.next != null) {
            p2 = head.next;
            head.next = p2.next;
            p2.next = p1;
            p1 = p2;
        }

        return p2;
    }

    public void invokReverseList() {
        ListNode head = createLinkedList();
        reverseList(head);
    }

    // 创建单链表
    private ListNode createLinkedList() {
        ListNode head = new ListNode(0);
        ListNode tail = new ListNode(0);

        for (int i = 1; i < 5; i++) {
            ListNode p = new ListNode(i);
            if (i == 1) {
                head.next = p;
                tail = p;
                continue;
            }
            tail.next = p;
            tail = p;
        }

        while (head != null) {
            System.out.print("createLinkedList:" + head.val);
            head = head.next;
        }

        return head;
    }


}