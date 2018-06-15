package nowcoder;

import java.util.ArrayList;

import alghorithm.util.TreeNode;
/**
*日期：2018年4月3日 下午4:00:24
*@author 龙
*哦吼吼：TreeToSequence
*描述：
*二叉树被记录成文件的过程叫做二叉树的序列化。
*序列化的方法有很多，这里我们采用括号序列的方法将其序列化，
*所谓括号序列指的是对于一个节点生成一个括号，括号内是其子树的括号序列，
*其中左儿子(若存在)的括号在前，
*右儿子(若存在)的括号在后。
*对于给定的树，请设计高效的算法，将其序列化。
*
给定一个树的根节点指针root，请返回一个字符串，代表其序列化后的括号序列。
**/
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class TreeToSequence {
	
	public String toSequence(TreeNode root) {
        // write code here
		
	
		String string = "";
		if(root == null) {
			return "";
		}else {
			string += "(" + toSequence(root.left) + toSequence(root.right) + ")";
			return string;
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode aNode = new TreeNode(4);
		TreeNode bNode = new TreeNode(2);
		TreeNode cNode = new TreeNode(1);
		aNode.left = bNode;
		aNode.right = cNode;
		String bbq = new TreeToSequence().toSequence(aNode);
		System.out.println(bbq);

	}

}
