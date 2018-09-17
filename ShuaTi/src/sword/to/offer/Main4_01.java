package sword.to.offer;
/**
 * @date 2018年9月1日 下午1:30:23
 * @author 龙
 * 类描述：二叉树的序列化和反序列化
 */
public class Main4_01 {

    String Serialize(TreeNode root) {
    	//使用递归形式的先序遍历序列化二叉树
    	StringBuilder strb = new StringBuilder();
    	preOrder(root, strb);
		return strb.toString();
        
    }
    private void preOrder(TreeNode root, StringBuilder strb) {
		// TODO Auto-generated method stub
		if(root == null) {
			strb.append("#,");
			return;
		}
		strb.append(root.val + ",");
		preOrder(root.left, strb);
		preOrder(root.right, strb);
	}
    
    
    //反序列化，建立二叉树
    int index = 0;
	TreeNode Deserialize(String str) {
		TreeNode root = null;
		if(str == null || str.length() == 0)
			return root;
		
		String[] arrays = str.split(",");
		root = dseA(arrays);
		return root;
    }
    
	private TreeNode dseA(String[] arrays) {
		// TODO Auto-generated method stub
		if(arrays[index].equals("#")) {
			index++;
			return null;
		}else {
			TreeNode nowNode = new TreeNode(0);
			nowNode.val = Integer.parseInt(arrays[index]);
			index++;
			nowNode.left = dseA(arrays);
			nowNode.right = dseA(arrays);
			return nowNode;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(100);
		TreeNode l1 = new TreeNode(1);
		TreeNode r1 = new TreeNode(2);
		TreeNode l2 = new TreeNode(3);
		TreeNode r2 = new TreeNode(4);
		TreeNode r3 = new TreeNode(5);
		TreeNode r4 = new TreeNode(6);
		root.left = l1;
		root.right = r1;
		l1.left = l2;
		r1.right = r2;
		r2.left = r3;
		r2.right = r4;
		
		Main4_01 test = new Main4_01();
		String result= test.Serialize(root);
		System.out.println(result);
		
		TreeNode root1 = test.Deserialize(result);
		System.out.println(root1.val + " " + root1.right.val);
	}

}
