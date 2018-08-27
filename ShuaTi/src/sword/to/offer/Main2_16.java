package sword.to.offer;
/**
*日期：2018年7月8日 下午7:12:08
*@author 龙
*哦吼吼：Main2_16
*描述：输入两个链表，找出它们的第一个公共结点
**/
public class Main2_16 {
	
	//暴力方法，时间复杂度为n2
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	 ListNode temp1 = pHead1;
    	 ListNode temp2 = pHead2;
    	 while(temp1 != null) {
    		 temp2 = pHead2;
    		 while(temp2 != null) {
    			 if(temp1 == temp2) {
    				 return temp1;
    			 }
    			 temp2 = temp2.next;
    		 }
    		 
    		 temp1 = temp1.next;
    	 }
    	 return null;
    }
    
    //牛客上好理解的方法，先走长的一个，走到相同长度，再一起走；
    //因为后面的链表为公共部分，单链表；
    public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
    	int len1 = findLengthOfList(pHead1);
    	int len2 = findLengthOfList(pHead2);
    	
    	if(len1 > len2)
    		pHead1 = walkStep(pHead1, len1 - len2);
    	if(len2 > len1)
    		pHead2 = walkStep(pHead2, len2 - len1);
    	//现在两个表一样长了，一起走即可
    	while(pHead1 != null) {
    		if(pHead1 == pHead2)
    			return pHead1;
    		pHead1 = pHead1.next;
    		pHead2 = pHead2.next;
    	}
    	return null;
    	
    }
    
    //走多的那个步长，走到一样长度
    private ListNode walkStep(ListNode pHead, int length) {
		// TODO Auto-generated method stub
		while(length-- != 0)
			pHead = pHead.next;
		
		return pHead;
	}
    
    //计算链表的长度
	private int findLengthOfList(ListNode pHead2) {
		// TODO Auto-generated method stub
		int length = 0;
		while(pHead2 != null) {
			length++;
			pHead2 = pHead2.next;
		}
		return length;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		ListNode ll = new ListNode(2);
		ListNode common = new ListNode(101);
		
		l1.next = ll;
		ll.next = common;
		l2.next = common;
		
		Main2_16 test = new Main2_16();
		ListNode result = test.FindFirstCommonNode1(l1, l2);
		System.out.println(result.val);
	}
}
