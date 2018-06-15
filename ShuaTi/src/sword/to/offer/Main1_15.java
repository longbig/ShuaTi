package sword.to.offer;

import sword.to.offer.ListNode;
/**
*日期：2018年5月14日 下午8:37:47
*@author 龙
*哦吼吼：Main1_15
*描述：单链表的反转，输出反转后的链表元素
**/
public class Main1_15 {
	
	//自己的方法，注意链表为空的情况，成功
    public ListNode ReverseList(ListNode head) {
    	if(head == null) {
    		return head;
    	}
    	ListNode[] listNodes = new ListNode[100000];
    	int i = 0;
    	while(head != null) {
    		listNodes[i] = head;
    		head = head.next;
    		i++;
    	}
    	head = listNodes[i-1];
    	for(int j = i-1; j >= 0; j--) {
    		if(j == 0) {
    			listNodes[j].next = null;
    		}else {
        		listNodes[j].next = listNodes[j-1];
    		}
    	}
    	return head;
    }
    
    //牛客上详细解法；
    public ListNode ReverseList1(ListNode head) {
    	//使用两个中间节点操作
    	ListNode pre = null;
    	ListNode next = null;
    	if(head == null) {
    		return head;
    	}
    	while(head != null) {
        	//先保存head.next节点
        	next = head.next;
        	//需要先断开，在断开前head指向pre
        	head.next = pre;
        	//注意后面head = next要使得head.next=pre，所以先使得head = pre
        	//这里的head是原来的头结点
        	pre = head;
        	//这里的head是原来的head.next
        	head = next;
    	}
    	//最后head会为空，只能返回前一个节点
    	return pre;
    	
    }
    
/*    链接：https://www.nowcoder.com/questionTerminal/75e878df47f24fdc9dc3e400ec6058ca
    	来源：牛客网

    	public class Solution {
    	    public ListNode ReverseList(ListNode head) {
    	       
    	        if(head==null)
    	            return null;
    	        //head为当前节点，如果当前节点为空的话，那就什么也不做，直接返回null；
    	        ListNode pre = null;
    	        ListNode next = null;
    	        //当前节点是head，pre为当前节点的前一节点，next为当前节点的下一节点
    	        //需要pre和next的目的是让当前节点从pre->head->next1->next2变成pre<-head next1->next2
    	        //即pre让节点可以反转所指方向，但反转之后如果不用next节点保存next1节点的话，此单链表就此断开了
    	        //所以需要用到pre和next两个节点
    	        //1->2->3->4->5
    	        //1<-2<-3 4->5
    	        while(head!=null){
    	            //做循环，如果当前节点不为空的话，始终执行此循环，此循环的目的就是让当前节点从指向next到指向pre
    	            //如此就可以做到反转链表的效果
    	            //先用next保存head的下一个节点的信息，保证单链表不会因为失去head节点的原next节点而就此断裂
    	            next = head.next;
    	            //保存完next，就可以让head从指向next变成指向pre了，代码如下
    	            head.next = pre;
    	            //head指向pre后，就继续依次反转下一个节点
    	            //让pre，head，next依次向后移动一个节点，继续下一次的指针反转
    	            pre = head;
    	            head = next;
    	        }
    	        //如果head为null的时候，pre就为最后一个节点了，但是链表已经反转完毕，pre就是反转后链表的第一个节点
    	        //直接输出pre就是我们想要得到的反转后的链表
    	        return pre;
    	    }
    	}
    */
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
