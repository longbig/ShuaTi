package sword.to.offer;

import java.util.Arrays;

import sword.to.offer.TreeNode;
/**
*日期：2018年5月16日 下午2:50:52
*@author 龙
*哦吼吼：Main1_4
*描述：通过前序遍历,和中序遍历序列 重建二叉树,返回树的根节点
*
**/
public class Main1_4 {
	/**
	 * 
	 * @param pre 前序遍历序列
	 * @param in  中序遍历序列
	 * @return 根节点
	 * 方法:使用递归的方式,获取前序遍历的第一个节点,根节点,
	 * 	   遍历中序序列,找到根节点位置,则左边为左子树,右为右;
	 * 	  现在把这两个子树看作是 两个新的二叉树,重新调用该方法,一直遍历到没有子树;
	 */
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	if(pre.length == 0 || in.length == 0) {
    		return null;
    	}
    	//根节点在递归方法中会是子树的根节点,这里是元根节点
    	TreeNode root = new TreeNode(pre[0]);
    	for(int i = 0; i < in.length; i++) {
    		if(in[i] == root.val) {
    			root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
    			root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
    		}
    	}
    	return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre = {1,2,4,5,3,6};
		int[] in = {4,2,5,1,6,3};
		TreeNode root = reConstructBinaryTree(pre, in);
		afterOrder(root);
	}
	//后序遍历
	public static void afterOrder(TreeNode root) {
		if(root != null) {
			afterOrder(root.left);
			afterOrder(root.right);
			System.out.println(root.val);
		}
	}

}
