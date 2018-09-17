package sword.to.offer;
/**
 * @date 2018年9月1日 下午3:33:49
 * @author 龙
 * 类描述：二叉搜索树的第K小的节点值
 */
public class Main4_02 {
	
	//思路：使用中序遍历，就是从小到大读了，设置1个计数器，到K就行
	int index = 0;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot != null) {
        	TreeNode lNode = KthNode(pRoot.left, k);
        	if(lNode != null) {
        		return lNode;
        	}
        	index++;
        	if(index == k) {
        		return pRoot;
        	}
        	lNode = KthNode(pRoot.right, k);
        	if(lNode != null) {
        		return lNode;
        	}
        	
        }
        return null;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
