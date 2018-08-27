package sword.to.offer;
/**
*@date 2018年8月21日 下午2:29:40
*@author 龙
*哦吼吼：Main2_05
*描述：输入一个复杂链表
*（每个节点中有节点值，以及两个指针
*，一个指向下一个节点，另一个特殊指针指向任意一个节点），
*返回结果为复制后复杂链表的head。
*（注意，输出结果中请不要返回参数中的节点引用，
*否则判题程序会直接返回空）
*/
/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Main2_05 {
	
	//Random部分不应该新建节点，不可取的方法
/*    public RandomListNode Clone(RandomListNode pHead)
    {
    	if(pHead == null)
    		return null;
    	
        RandomListNode head = new RandomListNode(pHead.label);
        RandomListNode current = head;
        while(pHead != null) {
        	if(pHead.next != null) {
        		current.next = new RandomListNode(pHead.next.label);
        	}
        	if(pHead.random != null) {
        		current.random = new RandomListNode(pHead.random.label);
        	}
        	
        	pHead = pHead.next;
        	current = current.next;
        }
        return head;
    }*/
	
		/*
		*解题思路：
		*1、遍历链表，复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
		*2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
		*3、拆分链表，将链表拆分为原链表和复制后的链表
		*/
    public RandomListNode Clone(RandomListNode pHead)
    {
    	if(pHead == null) {
    		return null;
    	}
        //1.复制每个节点
    	RandomListNode current = pHead;
    	while(current != null) {
    		RandomListNode cloneNode = new RandomListNode(current.label);
    		cloneNode.next = current.next;
    		current.next = cloneNode;
    		current = cloneNode.next;
    	}
    	
    	//2.复制随机指针
    	current = pHead;
    	while(current != null) {
    		RandomListNode cloneNode = current.next;
    		cloneNode.random = current.random == null ? null : current.random.next;
    		current = current.next.next;
    	}
    	
    	//3.拆分链表
    	current = pHead;
    	RandomListNode cloneList = pHead.next;
    	while(current != null) {
    		RandomListNode cloneNode = current.next;
    		current.next = cloneNode.next;
    		cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;
    		current = current.next;
    		cloneNode = cloneNode.next;
    	}
    	return cloneList;
    }
}
