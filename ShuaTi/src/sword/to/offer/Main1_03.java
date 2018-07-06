package sword.to.offer;

import java.util.ArrayList;
import java.util.Collections;

import sword.to.offer.ListNode;
/**
*日期：2018年5月14日 下午7:56:19
*@author 龙
*哦吼吼：Main1_3
*描述：输入一个链表，从尾到头打印链表每个节点的值。
*	注意输出结果是存储在ArrayList中的，不用打印；
**/

public class Main1_03 {
	//使用递归方法
	static ArrayList<Integer> test = new ArrayList<>();
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
      
        if(listNode != null) {
        	printListFromTailToHead(listNode.next);
        	test.add(listNode.val);
        }
        return test;
    }
    
    //方法二，使用Collection的reverse方法
    public static ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
    	ArrayList<Integer> tt = new ArrayList<>();
    	while(listNode != null) {
    		tt.add(listNode.val);
    		listNode = listNode.next;
    	}
    	Collections.reverse(tt);
    	return tt;
    }
    
    public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		ArrayList<Integer> tt = printListFromTailToHead1(n1);
		for(int i = 0; i < tt.size(); i++) {
			System.out.println(tt.get(i));
		}
	}
}
