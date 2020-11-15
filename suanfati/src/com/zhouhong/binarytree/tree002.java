package com.zhouhong.binarytree;

import java.util.Stack;

public class tree002 {
    public class Node {
        public int value;
        public Node left;
        public Node right;
        public Node(int data) {
            this.value = data;
        }
    }
    /**
     * 分别用递归和非递归实现二叉树的前，中，后序遍历
     * 前序遍历：根左右，中序遍历：左根右，后续遍历：左右根
     */
    /**
     * 二叉树前序遍历：递归
     * @param head
     */
    public void preOrderRecur(Node head){
        if (head == null){
            return;
        }
        System.out.println(head.value + " ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    /**
     * 二叉树中序遍历：递归
     * @param head
     */
    public void midOrderRecur(Node head){
        if (head == null){
            return;
        }
        midOrderRecur(head.left);
        System.out.println(head.value + " ");
        midOrderRecur(head.right);
    }

    /**
     * 二叉树后序遍历：递归
     * @param head
     */
    public  void lastOrderRecur(Node head){
        if (head == null){
            return;
        }
        lastOrderRecur(head.left);
        lastOrderRecur(head.right);
        System.out.println(head.value + " ");
    }

    /**
     * 二叉树前序遍历：非递归
     * @param head
     * 1.申请一个栈，记为stack,将头结点head压入stack中。
     * 2.从stack中弹出栈顶节点，记为cur,然后打印cur节点的值，再将节点cur的右边孩子压入stack,最后将cur的左孩子压入栈中。
     * 3.不断重复步骤2，直到stack为空，全部过程结束。
     */
    public void  preOrderRecur2(Node head){
       if (head != null){
           Stack<Node> stack = new Stack<Node>();
           stack.add(head);
           while (!stack.isEmpty()){
               head = stack.pop();
               System.out.println(head.value + " ");
                if (head.right != null){
                    stack.push(head.right);
                }
                if (head.left != null){
                    stack.push(head.left);
                }
           }
       }
        System.out.println();
    }


    /**
     * 二叉树中序遍历：非递归
     * @param head
     * 1.申请一个新的栈，记为stack,初始时，令变量cur = head.
     * 2.先把cur节点压入栈中，对以cur节点为头的整棵树来说，以此把左边界压入栈，即不停地令cur = cur.left,然后重复步骤2.
     * 3.不断的重复步骤2，直到发现cur为空，此时stack中弹出一个节点，记为node.打印node的值，并且让cur=node.right，然后继续重复步骤2.
     * 4.当stack为空时，整个过程结束。
     */
    public void midOrderRecur2(Node head){
        if (head != null){
            Stack<Node>stack = new Stack<Node>();
            while (!stack.isEmpty() || head != null){
                //将head压入栈中，继续将左边压入，直到左边为空。
                if (head != null){
                    stack.push(head);
                    head = head.left;
                }else {
                    //
                    head = stack.pop();
                    System.out.println(head.value + " ");
                    head = head.right;
                }
            }
        }
        System.out.println();
    }
}
