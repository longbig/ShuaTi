package sword.to.offer;
/**
*@date 2018年8月20日 下午6:11:54
*@author 龙
*哦吼吼：Main2_03
*描述：
*/
public class Main2_03 {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0)
        	return false;
        if(sequence.length == 1)
        	return true;
        return judge(sequence, 0, sequence.length-1);
    }
    
	private boolean judge(int[] sequence, int start, int end) {
		// TODO Auto-generated method stub
		if(start >= end)
			return true;
		//第一个大于根的位置
		int index = start;
		for(; index < end; index++) {
			if(sequence[index] > sequence[end])
				break;
		}
		//右子树中是否有小于根节点的值，有则false
		for(int j = index; j < end; j++) {
			if(sequence[j] < sequence[end])
				return false;
		}
		
		return judge(sequence, 0, index - 1) && judge(sequence, index, end - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
