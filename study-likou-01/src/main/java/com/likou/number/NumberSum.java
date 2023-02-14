package com.likou.number;

import com.likou.ListNode;

/**
 * <p>
 * 两数之和
 *
 * @author: mini
 * @Date: 2023-02-14 13:16
 * @Description: 两数之和
 */

public class NumberSum {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode cursor=listNode;
        int carry=0;
        while (l1!=null||l2!=null||carry!=0){
            int l1Val=l1!=null?l1.getVal():0;
            int l2Val=l1!=null?l2.getVal():0;
            int sumVal=l1Val+l2Val+carry;
            carry=sumVal/10;
            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next=sumNode;
            cursor=sumNode;
            if (l1!=null)
                l1=l1.next;
            if (l2!=null)
                l2=l2.next;
        }
        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        listNode.next=new ListNode(4);
        listNode.next.next=new ListNode(3);
        System.out.println(listNode.toString());
        ListNode listNode1 = new ListNode(5);
        listNode1.next=new ListNode(6);
        listNode1.next.next=new ListNode(4);
        ListNode listNode2 = addTwoNumbers(listNode, listNode1);

        System.out.println(listNode2);


    }
}
