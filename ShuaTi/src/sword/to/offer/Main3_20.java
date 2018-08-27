package sword.to.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
/**
*日期：2018年7月8日 下午7:52:17
*@author 龙
*哦吼吼：Main3_20
*描述：从上到下按层打印二叉树，
*同一层结点从左至右输出。每一层输出一行。

**/
public class Main3_20 {
	
	
	//层次遍历即可，用到队列，将根节点入队，出队，判断是否有左右子节点
	//有则将左  右子节点入队，直到为null
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	
    	ArrayList<ArrayList<Integer>> AllLists = new ArrayList<>();
    	
    	if(pRoot == null)
    		return AllLists;
    	//层次遍历,需要借助队列，要想每层都存放对应的层的数值，
    	//可以记录个数，加到数组里，到达该个数就换下一行了
    	LinkedList<TreeNode> queue = new LinkedList<>();
    	queue.offer(pRoot);
    	int start = 0, end = 1;
    	ArrayList<Integer> layer = new ArrayList();
    	while(!queue.isEmpty()) {
    		//一层
    		TreeNode temp = queue.pop();
    		layer.add(temp.val);
    		start++;
    		
    		if(temp.left != null) {
				queue.offer(temp.left);
			}
			if(temp.right != null) {
				queue.offer(temp.right);
			}
			
			//一层加完了
    		if(start == end) {
    			AllLists.add(layer);
    			start = 0;
    			end = queue.size();
    			layer = new ArrayList();
    		}
    	}
    	return AllLists;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main3_20 test = new Main3_20();
		TreeNode root = new TreeNode(1);
		TreeNode l1_1 = new TreeNode(2);
		TreeNode l1_2 = new TreeNode(3);
		TreeNode l2_1 = new TreeNode(4);
		TreeNode l3 = new TreeNode(33);
		root.left = l1_1;
		root.right = l1_2;
		l1_1.right = l2_1;
		l2_1.left = l3;
		
		ArrayList<ArrayList<Integer>> print = test.Print(root);
		for (ArrayList<Integer> arrayList : print) {
			for (Integer integer : arrayList) {
				System.out.print(integer);
			}
			System.out.println();
		}
		

	}

}
