package sword.to.offer;

import java.util.ArrayList;

/**
 * @date 2018年8月29日 下午9:35:00
 * @author 龙
 * 类描述：二叉树的下一个节点
 * 
 * 给定一个二叉树和其中的一个结点，
 * 请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，
 * 同时包含指向父结点的指针。
 */
public class Main3_17 {
	
//	public TreeLinkNode target = null;
//	public ArrayList<TreeLinkNode> list = new ArrayList<>();
//	
//    public TreeLinkNode GetNext(TreeLinkNode pNode)
//    {
//        if(pNode == null)
//        	return null;
//        TreeLinkNode ppNode = pNode;
//        TreeLinkNode rootNode = null;
//        while(ppNode.next != null) {
//        	ppNode = ppNode.next;
//        }
//        rootNode = ppNode;
//        //开始中序遍历，
//        middleFoot(rootNode, pNode);
//        for(int i = 0; i < list.size(); i++) {
//        	if(list.get(i) == pNode) {
//        		if(i < list.size() - 1)
//        			this.target = list.get(i + 1);
//        	}
//        }
//        return this.target;
//    }
//    
//	private void middleFoot(TreeLinkNode rootNode, TreeLinkNode pNode) {
//		// TODO Auto-generated method stub
//		if(rootNode == null) {
//			return;
//		}
//		middleFoot(rootNode.left, pNode);
//		list.add(rootNode);
//			
//		middleFoot(rootNode.right, pNode);
//		
//	}

	
	//牛客上好的解法，分为右子树存在，和右子树不存在两种情况
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		if(pNode == null)
			return null;
		//右子树存在的情况
		if(pNode.right != null) {
			//找到右子树的最左边的节点
			pNode = pNode.right;
			while(pNode.left != null) {
				pNode = pNode.left;
			}
			return pNode;
		}
		//右子树不存在
		//找到区域子树的根节点
		while(pNode.next != null) {
			//返回区域根节点
			if(pNode.next.left == pNode) {
				return pNode.next;
			}
			pNode = pNode.next;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main3_17 test = new Main3_17();
		TreeLinkNode root = new TreeLinkNode(0);
		TreeLinkNode l1 = new TreeLinkNode(1);
		TreeLinkNode r1 =  new TreeLinkNode(2);
		TreeLinkNode l2 = new TreeLinkNode(3);
		root.left = l1;
		root.right = r1;
		l1.right = l2;
		l1.next = root;
		r1.next = root;
		l2.next = l1;
		TreeLinkNode result = test.GetNext(l1);
		System.out.println(result.val);
	}

}
