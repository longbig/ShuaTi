package sword.to.offer;
/**
*@date 2018年7月19日 下午7:15:45
*@author 龙
*哦吼吼：Test
*描述：
*/
public class Test {

	public static void main(String[] args) {
		ListNode p1 = new ListNode(1);
		ListNode p2 = new ListNode(2);
		ListNode p3 = new ListNode(3);
		p1.next = p2;
		p2.next = p3;
		ListNode pListNode = reverseTable(p1);
		while(pListNode != null) {
			System.out.println(pListNode.val);
			pListNode = pListNode.next;
		}
	}

	
	public static ListNode reverseTable(ListNode head){
	    ListNode current = head;
	    ListNode pre = null;
	    ListNode tmp = null;
	    ListNode reverseHead = null;
	        
	    while(current != null){
	        tmp = current.next;
	        
	        if(tmp == null)
	            reverseHead = current;
	        current.next = pre;
	        pre = current;
	        current = tmp;     
	    } 
	    return reverseHead;
	} 
}
