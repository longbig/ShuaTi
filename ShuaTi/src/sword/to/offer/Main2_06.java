package sword.to.offer;
/**
*@date 2018年8月21日 下午4:16:11
*@author 龙
*哦吼吼：Main2_06
*描述：
*输入一棵二叉搜索树，
*将该二叉搜索树转换成一个排序的双向链表。
*要求不能创建任何新的结点，只能调整树中结点指针的指向。
*/
public class Main2_06 {

	/**递归思路
	 * 
	 * @param pRootOfTree
	 * @return
	 * 1.将左子树构造成链表，
	 * 2.判断左子树是否为空，将root加到左子树最后；
	 * 3.将右子树构造成链表；
	 * 4.将root放到右子树头部；
	 *  判断右子树是否空
	 * 5.确定左子树是否空，确定返回左子树头，还是root；
	 */
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) {
        	return null;
        }
        if(pRootOfTree.left == null && pRootOfTree.right == null) {
        	return pRootOfTree;
        }
        //1.构造左链表,定位到头部
        TreeNode left = Convert(pRootOfTree.left);
        TreeNode pNode = left;
        //2.将root加到左链表尾部
        while(pNode != null && pNode.right != null) {
        	pNode = pNode.right;
        }
        //需要判断左链表是否为空
        if(pNode != null) {
        	pRootOfTree.left = pNode;
            pNode.right = pRootOfTree;
        }
        //3.构造右链表
        TreeNode right = Convert(pRootOfTree.right);
        //判断是否为空，加过来
        if(right != null) {
        	pRootOfTree.right = right;
            right.left = pRootOfTree;
        }
        
        //确认返回值
        if(left != null) 
        	return left;
        return pRootOfTree;
        
    }
}
