package sword.to.offer;
/**
*日期：2018年7月5日 下午8:40:04
*@author 龙
*哦吼吼：Main1_18
*描述：操作给定的二叉树，将其变换为源二叉树的镜像。
输入描述:
二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
**/
public class Main1_18 {
	/**
	 * 方法：采用分治的策略，即对于每个有孩子节点，交换它们的左右孩子节点即可；
	 * @param root
	 */
    public static void Mirror(TreeNode root) {
        if(root == null)
        	return;
        //直接交换左右子树
        if(root.left != null || root.right != null) {
        	TreeNode temp = root.left;
        	root.left = root.right;
        	root.right = temp;
        }
        Mirror(root.left);
        Mirror(root.right);
    }
    
    public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		TreeNode r1 = new TreeNode(1);
		TreeNode r2 = new TreeNode(2);
		root.left = r1;
		root.right = r2;
		Mirror(root);
		System.out.println(root.left.val + " " + root.right.val);
	}
}
