package sword.to.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @date 2018年8月31日 下午3:57:32
 * @author 龙
 * 类描述：按之字形顺序打印二叉树
 * 
请实现一个函数按照之字形打印二叉树，
即第一行按照从左到右的顺序打印，
第二层按照从右至左的顺序打印，
第三行按照从左到右的顺序打印，
其他行以此类推。
 */
public class Main3_19 {

	//解题思路，用两个栈存储奇数层，偶数层数据即可
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer> > allRoute = new ArrayList<>();
    	int layer = 1;
    	if(pRoot == null)
    		return allRoute;
    	//存储奇数层
    	Stack<TreeNode> s1 = new Stack<>();
    	s1.push(pRoot);
    	//偶数层
    	Stack<TreeNode> s2 = new Stack<>();
    	while(!s1.isEmpty() || !s2.isEmpty()) {
    		//奇数层,从左到右
    		if(layer % 2 == 1) {
    			ArrayList<Integer> oddList = new ArrayList<>();
    			while(!s1.isEmpty()) {
    				TreeNode temp = s1.pop();
    				if(temp != null) {
    					oddList.add(temp.val);
    					s2.push(temp.left);
    					s2.push(temp.right);
    				}
    			}
    			if(!oddList.isEmpty()) {
    				allRoute.add(oddList);
        			layer++;
    			}
    			
    		}
    		//偶数层
    		else {
    			ArrayList<Integer> evenList = new ArrayList<>();
    			while(!s2.isEmpty()) {
    				TreeNode temp = s2.pop();
    				if(temp != null) {
    					evenList.add(temp.val);
    					s1.push(temp.right);
    					s1.push(temp.left);
    				}
    			}
    			if(!evenList.isEmpty()) {
    				allRoute.add(evenList);
    				layer++;
    			}
    		}
    	}
    	return allRoute;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
