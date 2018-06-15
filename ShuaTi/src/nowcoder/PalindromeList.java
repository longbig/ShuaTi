package nowcoder;

import java.util.*;

import alghorithm.util.ListNode;
/**
*日期：2018年4月3日 下午2:46:50
*@author 龙
*哦吼吼：PalindromeList
*描述：
*题目描述
对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。

给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。保证链表长度小于等于900。

测试样例：
1->2->2->1
返回：true
*
*
**/
public class PalindromeList {
	
	Stack<Integer> stack = new Stack();
	Queue<Integer> queue = new LinkedList();

    public boolean chkPalindrome(ListNode A) {
        // write code here
    	while(A != null) {
    		stack.push(A.val);
    		queue.add(A.val);
    		A = A.next;
    	}
    	
    	while(!stack.isEmpty()) {
    		
    		//注意使用equals方法
    		
    		if(!stack.pop().equals(queue.poll())){
    			break;
    		}
    	}
    	if(stack.isEmpty()) {
    		return true;
    	}else {
    		return false;
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
		ListNode c = new ListNode(2);
		ListNode d = new ListNode(1);
		A.next = B;
		B.next = c;
		c.next = d;
		boolean ss = new PalindromeList().chkPalindrome(A);
		System.out.println(ss);
	}

}
