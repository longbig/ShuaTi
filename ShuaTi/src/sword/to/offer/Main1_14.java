package sword.to.offer;
/**
*日期：2018年6月15日 下午6:40:42
*@author 龙
*哦吼吼：Main1_14
*描述：输入一个链表，输出该链表中倒数第k个结点。
*
**/
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Main1_14 {
	
    public static ListNode FindKthToTail(ListNode head,int k) {
    	int length = 0;
    	ListNode head1 = head;
    	while (head != null) {
    		length++;
    		head = head.next;
		}
    	
    	if(k > length || k < 0) {
    		return null;
    	}
    	head = head1;
    	for(int i = 0; i < length-k;i++) {
    		head = head.next;
    	}
    	return head;
    }
    
    public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(4);
		ListNode n4 = new ListNode(6);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		ListNode result = FindKthToTail(n1, 2);
		System.out.println(result.val);
	}
    
    
}
