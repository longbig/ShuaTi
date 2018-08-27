package sword.to.offer;
/**
*日期：2018年7月10日 上午10:59:25
*@author 龙
*哦吼吼：Main1_16
*描述：输入两个单调递增的链表，
*输出两个链表合成后的链表，
*当然我们需要合成后的链表满足单调不减规则。
**/
public class Main1_16 {
	
	//常规方法，创建一个新链表存储结果
    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode newList = new ListNode(0);
        ListNode head = newList;
        
        if(list1 == null)
        	return list2;
        if(list2 == null)
        	return list1;
        
        //用两个指针遍历两个链表，取小的那个
        while(list1 != null || list2 != null) {
    		//新链表的下一节点
        	int smallOne = Math.min(list1.val, list2.val);
    		ListNode nextNode = new ListNode(smallOne);
    		newList.next = nextNode;
    		newList = newList.next;
    		
    		//两链表一个指针移动
    		if(smallOne == list1.val) {
    			list1 = list1.next;
    			//移动之后为空的情况
        		if(list1 == null) {
        			while(list2 != null) {
        				newList.next = list2;
        				list2 = list2.next;
        			}
        		}
    		}else if(smallOne == list2.val) {
    			list2 = list2.next;
    			if(list2 == null) {
    				while(list1 != null) {
    					newList.next = list1;
    					list1 = list1.next;
    				}
    			}
    		}
        }
        return head.next;
        
        
    }
    
    public static void main(String[] args) {
		ListNode list1 = new ListNode(0);
		ListNode list2 = new ListNode(1);
		ListNode l1_1 = new ListNode(3);
		ListNode l2_1 = new ListNode(2);
		ListNode l1_2 = new ListNode(10);
		ListNode l2_2 = new ListNode(3);
		list1.next = l1_1;
		l1_1.next = l1_2;
		list2.next = l2_1;
		l2_1.next = l2_2;
		
		ListNode ll1 = null;
		ListNode ll2 = null;
		ListNode result = Merge(list1, list2);
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
