package sword.to.offer;

import java.util.LinkedList;
import java.util.Queue;

/**
*日期：2018年7月10日 下午1:22:43
*@author 龙
*哦吼吼：Main1_17
*描述：输入两棵二叉树A，B，
*判断B是不是A的子结构。
*（ps：我们约定空树不是任意一个树的子结构）
**/
public class Main1_17 {
	/**
	 * 
	 * @param root1
	 * @param root2
	 * @return root2是否是root1的子树
	 * 注意比较的应该是数值，不是地址
	 * 采用先序遍历，用队列存储两者结果，比较是否有子序列
	 */
/*    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        Queue<Integer> listA = new LinkedList();
        Queue<Integer> listB = new LinkedList();
        listA = prevScan(root1, listA);
        listB = prevScan(root2, listB);
        int[] A = new int[listA.size()];
        int[] B = new int[listB.size()];
        int i = 0, j = 0;
        
        for (Integer integer : listA) {
        	A[i++] = integer;
			System.out.println(integer);
		}
        for (Integer integer : listB) {
        	B[j++] = integer;
			System.out.println(integer);
		}
       
        
        //比较两个队列
        boolean flag = true;
        for(i = 0; i < listA.size(); i++) {
        	//第1相同
        	if(A[i] == B[0]) {
        		for(j = 0; j < listB.size(); j++) {
        			if(A[i + j] != B[j])
        				flag = false;
        		}
        	}
        }
        return flag;
        
    }
    //先序遍历
    private Queue<Integer> prevScan(TreeNode root, Queue<Integer> list) {
		// TODO Auto-generated method stub
    	if(root != null)
    		list.offer(root.val);
    	if(root.left != null)
    		prevScan(root.left, list);
    	if(root.right != null)
    		prevScan(root.right, list);
    	
		return list;
	}*/
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        //只有两者都不为0时才能为true
        if(root1 != null && root2 != null) {
        	//找到A树里有B树的根节点时,以该节点判断是否包含B树
        	if(root1.val == root2.val) 
        		result = isAHasB(root1, root2);
        	
        	if(!result)
        		result = HasSubtree(root1.left, root2);
        	if(!result)
        		result = HasSubtree(root1.right, root2);
        		
        }
        return result;
    }

    //判断A树中是否包含B树
	private boolean isAHasB(TreeNode treeA, TreeNode treeB) {
		// TODO Auto-generated method stub
		//如果把B遍历完了，没问题，返回true；
		if(treeB == null)
			return true;
		//如果A树完了，B树没完，则不包含
		if(treeA == null)
			return false;
		//一个点不一样，返回false
		if(treeA.val != treeB.val)
			return false;
		//同步遍历
		return isAHasB(treeA.left, treeB.left) && isAHasB(treeA.right, treeB.right);	
	}


	public static void main(String[] args) {
		Main1_17 test = new Main1_17();
		TreeNode roota = new TreeNode(0);
		TreeNode rootb = new TreeNode(2);
		TreeNode left1 = new TreeNode(1);
		TreeNode right1 = new TreeNode(2);
		TreeNode ll = new TreeNode(4);
		TreeNode l2 = new TreeNode(4);
		TreeNode l3 = new TreeNode(5);
		TreeNode l4 = new TreeNode(5);
		roota.left = left1;
		roota.right = right1;
		right1.left = ll;
		right1.right = l3;
		
		rootb.left = l2;
//		rootb.right = l4;
		
		
		boolean out = test.HasSubtree(roota, rootb);
		System.out.println(out);
	}
    
}
