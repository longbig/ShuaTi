package sword.to.offer;

import java.util.ArrayList;
import java.util.LinkedList;

import sword.to.offer.TreeNode;
/**
*@date 2018年8月20日 下午5:15:37
*@author 龙
*哦吼吼：Main2_02
*描述：
*/
public class Main2_02 {
	
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        //二叉树的层次遍历
    	ArrayList<Integer> levelOrder = new ArrayList();
    	
    	if(root == null) 
    		return levelOrder;
    	
    	LinkedList<TreeNode> queue = new LinkedList();
    	TreeNode current = null;
    	queue.offer(root);
    	while(!queue.isEmpty()) {
    		current = queue.pop();
    		levelOrder.add(current.val);
    		
    		if(current.left != null) {
    			queue.offer(current.left);
    		}
    		if(current.right != null) {
    			queue.offer(current.right);
    		}
    	}
    	
    	return levelOrder;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
