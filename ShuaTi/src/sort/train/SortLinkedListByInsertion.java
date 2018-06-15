package sort.train;

import alghorithm.util.ListNode;

/**
*日期：2018年5月30日 下午7:37:35
*@author 龙
*哦吼吼：SortLinkedListByInsertion
*描述：用插入排序的方法，排序一个单链表
*
**/
public class SortLinkedListByInsertion {

    public static ListNode insertionSortList(ListNode head) {
    	ListNode dump = new ListNode(Integer.MIN_VALUE);
    	ListNode cur = head;
    	ListNode pre = dump; 
    	
    	while(cur != null) {
    		ListNode next1 = cur.next;
    		pre = dump;
    		//注意逻辑与是短路的啊。。。。，
    		// 如果左右互相换的话，会报空指针异常。。。。。。
    		while(pre.next != null && pre.next.val < cur.val ) {
    			pre = pre.next;
    		}
    		cur.next = pre.next;
    		pre.next = cur;
    		
    		cur = next1;
    	}
		return dump.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(6);
		ListNode n4 = new ListNode(2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n1 = insertionSortList(n1);
		while(n1 != null) {
			System.out.println(n1.val);
			n1 = n1.next;
		}
	}

}
