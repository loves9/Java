package com.fenng.algorithms.algorithm;

public class LinkNode {
    // 入口函数
    public static void main(String[] arg){

        LinkNode linkedListReverse = new LinkNode();

        // 1.创建链表
        Node head = linkedListReverse.createLinkedList();
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        // 2.链表逆序
        Node reverseHead = linkedListReverse.linkedListReverse(linkedListReverse.createLinkedList());
        while (reverseHead != null){
            System.out.print(reverseHead.data + " ");
            reverseHead = reverseHead.next;
        }
    }

    // 链表节点
    class Node {
        int data;
        Node next;

        private Node(int data){

            this.data = data;
        }
    }

    // 创建单链表
    private  Node createLinkedList(){
        Node head = new Node(0);
        Node tail = new Node(0);


        for (int i = 1; i < 5; i++){
            Node p = new Node(i);
            if (i == 1){
                head.next = p;
                tail = p;
                continue;
            }
            tail.next = p;
            tail = p;
        }

        return head;
    }

    // 链表逆序
    private Node linkedListReverse(Node head){
        Node p1,p2 = null;
        p1 = head;

        while (head.next != null){
            p2 = head.next;
            head.next = p2.next;
            p2.next = p1;
            p1 = p2;
        }

        return p2;
    }
}
