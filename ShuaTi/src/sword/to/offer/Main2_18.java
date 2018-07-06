package sword.to.offer;
/**
*日期：2018年7月4日 下午7:51:16
*@author 龙
*哦吼吼：Main2_18
*描述：
*题目描述
输入一棵二叉树，求该树的深度。
从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，
最长路径的长度为树的深度
**/
public class Main2_18 {
	
	//递归方法
    public int TreeDepth(TreeNode root) {
        if(root == null)
        	return 0;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right) + 1;
    }
    
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode r2 = new TreeNode(2);
		TreeNode r3 = new TreeNode(3);
		TreeNode r4 = new TreeNode(4);
		root.left = r2;
		r2.left = r3;
		r3.right = r4;
		int height = new Main2_18().TreeDepth(root);
		System.out.println(height);
		
		
	}

}
