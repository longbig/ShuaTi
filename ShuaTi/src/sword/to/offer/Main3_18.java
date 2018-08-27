package sword.to.offer;
/**
*@date 2018年7月12日 下午2:11:24
*@author 龙
*哦吼吼：Main3_18
*描述：
*描述
请实现一个函数，用来判断一颗二叉树是不是对称的。
注意，如果一个二叉树同此二叉树的镜像是同样的，
定义其为对称的。
*/
public class Main3_18 {
	//思路，先得出这颗二叉树的镜像二叉树，再比较
    boolean isSymmetrical(TreeNode pRoot)
    {
    	if(pRoot == null)
    		return true;
        TreeNode mirrorPRoot = new TreeNode(0);
        //复制这颗二叉树
        mirrorPRoot = copyTree(pRoot);
        //原树变为镜面二叉树
        mirrorTree(pRoot);
        //比较两棵树
        boolean isDD = isSameTree(pRoot, mirrorPRoot);
        
        printTree(pRoot);
        System.out.println();
        printTree(mirrorPRoot);
        
        return isDD;
    }
    
    //复制二叉树
	private TreeNode copyTree(TreeNode pRoot) {
		// TODO Auto-generated method stub
		TreeNode mirrorPRoot = new TreeNode(0);
		if(pRoot != null) {
			mirrorPRoot.val = pRoot.val;
			mirrorPRoot.left = copyTree(pRoot.left);
			mirrorPRoot.right = copyTree(pRoot.right);
		}else {
			mirrorPRoot = null;
		}
		return mirrorPRoot;
	}
	
	//镜面二叉树和原树比较
	private boolean isSameTree(TreeNode pRoot, TreeNode mirrorPRoot) {
		// TODO Auto-generated method stub
		//树结构不一样
		if((pRoot == null && mirrorPRoot!=null) || (pRoot!=null && mirrorPRoot==null))
			return false;
		
		//到头了
		if (pRoot == null && mirrorPRoot == null) {
			return true;
		}
		if (pRoot.val != mirrorPRoot.val) {
			return false;
		}else {
			return (isSameTree(pRoot.left, mirrorPRoot.left) &&
					isSameTree(pRoot.right, mirrorPRoot.right));
		}	
	}
	
	//变为镜面二叉树
	private void mirrorTree(TreeNode pRoot) {
		// TODO Auto-generated method stub
		if(pRoot == null) {
			return;
		}
		if(pRoot.left != null || pRoot.right != null){
			TreeNode temp = pRoot.left;
			pRoot.left = pRoot.right;
			pRoot.right = temp;
		}
		
		mirrorTree(pRoot.left);
		mirrorTree(pRoot.right);
	}
	
	/**
	 * 牛客上比价好的解法，直接比较各级的左右子节点值是否都相等，
	 * 注意要比较左右子节点是否都存在
	 * 递归比较
	 * @param pRoot
	 * @return
	 */
    boolean isSymmetrical1(TreeNode pRoot)
    {
        if(pRoot == null)
        	return true;
        return compareSS(pRoot.left, pRoot.right);
    }

	private boolean compareSS(TreeNode left, TreeNode right) {
		// TODO Auto-generated method stub
		if (left == null) 
			return right == null;
		if(right == null)
			return false;
		if(left.val != right.val)
			return false;
		//关键递归
		return (compareSS(left.left, right.right) && compareSS(left.right, right.left));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main3_18 test = new Main3_18();
		TreeNode root = new TreeNode(0);
		TreeNode r1 = new TreeNode(1);
		TreeNode r2 = new TreeNode(1);
		TreeNode r3 = new TreeNode(3);
		TreeNode r4 = new TreeNode(3);
		root.left = r1;
		root.right = r2;
		r2.right = r3;
		r1.left = r4;
		
		boolean same = test.isSymmetrical1(root);
		System.out.println(same);
		
		
	}
	
	//打印二叉树
	private void printTree(TreeNode pRoot) {
		if(pRoot == null) {
			return;
		}else {
			System.out.print("-> " + pRoot.val);
			printTree(pRoot.left);
			printTree(pRoot.right);
		}
			
	}

}
