package sword.to.offer;

import java.util.ArrayList;

/**
*@date 2018年8月21日 下午1:59:52
*@author 龙
*哦吼吼：Main2_04
*描述：输入一颗二叉树的跟节点和一个整数，
*打印出二叉树中结点值的和为输入整数的所有路径。
*
*路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
*(注意: 在返回值的list中，数组长度大的数组靠前)
*/
public class Main2_04 {

	ArrayList<ArrayList<Integer>> allPath = new ArrayList<>();
	ArrayList<Integer> list = new ArrayList<>();
	
	//递归方法深度遍历二叉树
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null) {
        	return allPath;
        }
        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null) {
        	allPath.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size() - 1);
        return allPath;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
