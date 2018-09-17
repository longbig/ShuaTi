package sword.to.offer;

import java.util.ArrayList;

/**
 * @date 2018年8月29日 下午8:26:45
 * @author 龙
 * 类描述：链表中环的入口节点
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null
 */
public class Main3_15 {
	
	//使用快慢两个指针，相遇点一定在环内，如果快点到了null，则没有环
	public static ListNode EntryNodeOfLoop(ListNode pHead) {
		if(pHead == null || pHead.next == null || pHead.next.next == null)
			return null;
		ListNode slow = pHead.next;
		ListNode fast = pHead.next.next;
		//快慢开始走
		while(slow != fast) {
			//确定是否有环
			if(fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}else {
				return null;
			}
		}
		//到达slow=fast点
		fast = pHead;
		while(fast != slow) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}
	
	//该解法有点投机取巧了。。。。
/*    public static ListNode EntryNodeOfLoop(ListNode pHead)
    {	
    	if(pHead == null)
    		return null;
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode startNode = null;
        while(pHead.next != null) {
        	if(list.contains(pHead)) {
        		startNode = pHead;
        		break;
        	}
        	list.add(pHead);
        	pHead = pHead.next;
        	
        }
        return startNode;
        
    }*/
    
    //断链法，特别简单
    //每次都断开一条链，最后只有环的起始节点留下
/*    public static ListNode EntryNodeOfLoop1(ListNode pHead) {
    	if(pHead == null || pHead.next == null)
    		return null;
    	ListNode slow = pHead;
    	ListNode fast = pHead.next;
    	while(fast != null) {
    		slow.next = null;
    		slow = fast;
    		fast = fast.next;
    	}
    	return slow;
    }*/

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l2;
		
		System.out.println(EntryNodeOfLoop(l1).val);
	}

}
