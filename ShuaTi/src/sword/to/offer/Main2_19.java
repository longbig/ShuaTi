package sword.to.offer;

import sword.to.offer.TreeNode;

import static sword.to.offer.Main1_4.*;
/**
*日期：2018年5月16日 下午3:48:57
*@author 龙
*哦吼吼：Main2_19
*描述：判断一颗树是否是平衡二叉树
*平衡二叉树的左右子树高度之差不超过1
**/
public class Main2_19 {

	private boolean isTree = true;
	//使用递归的方法,比较左右子节点的树高度
    public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);
        return isTree;
    }
    //获取节点的树高度
    public int getDepth(TreeNode newNode) {
    	if(newNode == null) {
    		return 0;
    	}else {
    		int leftHight = getDepth(newNode.left);
    		int rightHight = getDepth(newNode.right);
    		if(Math.abs(rightHight - leftHight) > 1) {
    			isTree = false;
    		}
    		return rightHight > leftHight ? rightHight+1 : leftHight+1;
    	}
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre = {1,2,4,5};
		int[] in = {4,2,5,1};
		TreeNode root = reConstructBinaryTree(pre, in);
		
		Main2_19 test = new Main2_19();
		System.out.println(test.IsBalanced_Solution(root));
	}

}
