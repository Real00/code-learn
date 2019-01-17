package com.hear;

/**
 * @description: 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * @author: WANGJR
 * @create: 2019-01-03 22:26
 **/
public class AddTwoNumbers {

    /**
     * 定义一个节点类
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummay = new ListNode(0);
        int sum = 0;
        ListNode p1 = l1, p2 = l2;
        //非常重要的一点！
        //当一个实体赋值给另一个实体，实际上传的是地址
        //另一个实体做任何操作，原来的实体也会同步改变
        ListNode cur = dummay;
        while (p1 != null || p2 != null) {
            if(p1!=null){
                sum+=p1.val;
                p1= p1.next;
            }
            if(p2!=null){
                sum+=p2.val;
                p2=p2.next;
            }
            cur.next = new ListNode(sum%10);
            sum /=10;
        }
        if(sum==1){
            cur.next =new ListNode(1);
        }
        return dummay.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next =new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next =new ListNode(4);

        addTwoNumbers(l1,l2);

    }
}
