package com.zhouhong.suanfati;

public class sf001 {
    public static class  Node{
        public int value;
        public Node left;
        public Node right;
        public Node(int v){
            value = v;
        }
    }
    //搜索二叉树：左节点小于头，右节点大于头结点（BST）
    /**
     * 题目：
     * 已知一个搜索二叉树后续遍历（左右头）的数组posArr,请根据posArr
     * 重建出整棵树，返回出新建树的头结点
     */
    /**
     * 思路：
     * 1.整棵树的头结点为最后一个数
     * 2.找到比最后一个数小的所有数建左树，比最后一个数大的数建右树
     */
    public static Node posArrayToBST1(int[] posArr){
        //0---N-1
        return process1(posArr,0,posArr.length - 1);
    }
    //使用posArr[L....R]这些数字建立这棵树
    //建出的每个节点都连好，然后把整棵树的头结点返回
    //时间复杂度：按照最差情况：每次建立一棵树（都大于/小于头结点）O(N^2)
    /**第一种：
     * @param posArr
     * @param L
     * @param R
     * @return
     */
    public static Node process1(int[] posArr,int L,int R){
        //无效返回空节点
        if (L > R){
            return null;
        }
        //L<=R   posArr[R]:头结点
        Node head = new Node(posArr[R]);
        //这个范围中有且只有一个数，直接返回头结点
        if (L == R){
            return head;
        }
        //L<R
        //[L....R-1]范围内找到小于posArr[R]的数
        //防止头结点都大于或者小于头结点,节省代码{原版：process3}
        int M = L-1;
        for (int i = L; i < R; i++) {
            if (posArr[i] < posArr[R]){
                M = i;
            }
        }
        //[L...M]都小于头结点   [M+1.......R-1]都大于头结点
        //用小于头结点的建立左树，剩下的建立右树
        head.left = process1(posArr,L,R);
        head.right = process1(posArr,M + 1,R-1);
        return head;
    }
    /**
     * 第二种
     * @param posArr
     * @param L
     * @param R
     * @return
     */
    public static Node process3(int[] posArr,int L,int R){
        //L<=R   posArr[R]:头结点
        Node head = new Node(posArr[R]);
        //这个范围中有且只有一个数，直接返回头结点
        if (L == R){
            return head;
        }
        //L<R
        //[L....R-1]范围内找到小于posArr[R]的数
        int M = -1;
        for (int i = L; i < R; i++) {
            if (posArr[i] < posArr[R]){
                M = i;
            }
        }
        if (M == -1){
            head.right = process3(posArr,L,M);
        }else if (M == R - 1){
            head.left = process3(posArr,L,R-1);
        }else {
            head.left = process3(posArr,L,R);
            head.right = process3(posArr,M + 1,R-1);
        }
        return head;
    }
    //时间复杂度：O(N*log2N)
    /**
     * 使用二分查找方法找到比头结点小或者大的数
     * @param posArr
     * @param L
     * @param R
     * @return
     */
    public static Node process2(int[] posArr,int L,int R){
        //无效返回空节点
        if (L > R){
            return null;
        }
        //L<=R   posArr[R]:头结点
        Node head = new Node(posArr[R]);
        //这个范围中有且只有一个数，直接返回头结点
        if (L == R){
            return head;
        }
        int M = L - 1;
        int left = L;
        int right = R - 1;
        while (left <=    right){
            //mid = (L+R) / 2    可能溢出
            //mid = L + (R - L) / 2   除以2 ====  向右移一位
            int mid = left + ((right - left) >> 1);

            if (posArr[mid] < posArr[R]){
                M = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        head.left = process2(posArr,L,M);
        head.right = process2(posArr,M,R-1);
        return head;
    }
}
