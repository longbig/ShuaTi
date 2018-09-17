package sword.to.offer;
/**
 * @date 2018年8月30日 上午11:08:13
 * @author 龙
 * 类描述：删除链表中重复的点
 */
public class Main3_16 {
	
    public ListNode deleteDuplication(ListNode pHead)
    {
    	//递归方法
    	if(pHead == null || pHead.next == null)
    		return pHead;
    	if(pHead.val == pHead.next.val) {
    		ListNode node = pHead.next;
    		while(node != null && node.val == pHead.val) {
    			node = node.next;
    		}
    		return deleteDuplication(node);
    	}
    	//不重复节点
    	else {
			pHead.next = deleteDuplication(pHead.next);
			return pHead;
		}
    	
    	
    }
    
}
