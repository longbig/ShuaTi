package sword.to.offer;
/**
*日期：2018年7月5日 下午7:56:42
*@author 龙
*哦吼吼：Main1_10
*描述：
*我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
*请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
*总共有多少种方法？
**/
public class Main1_10 {
	//就是走楼梯问题
    public static int RectCover(int target) {
    	if(target < 1)
    		return 0;
    	if(target == 1 || target == 2)
    		return target;
    	return RectCover(target - 2) + RectCover(target - 1);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 3;
		System.out.println(RectCover(target));
	}

}
