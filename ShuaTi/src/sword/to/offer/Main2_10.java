package sword.to.offer;
/**
*日期：2018年4月25日 下午2:09:43
*@author 龙
*哦吼吼：Main2_10
*描述：表示牛客网剑指offer第2页第10题；
*
*求连续子数组的最大和；
*例如:{6,-3,-2,7,-15,1,2,2},
*连续子向量的最大和为8(从第0个开始,到第3个为止)。
*你会不会被他忽悠住？(子向量的长度至少是1)
*
**/
public class Main2_10 {
	
	public static int FindGreatestSumOfSubArray(int[] array) {
		int i, len = array.length;
		int[] dp = new int[100000];
		dp[0] = array[0];
		int res = dp[0];
		for(i = 1; i < len; i++) {
			dp[i] = Math.max(0, dp[i - 1]) + array[i];
			res = Math.max(dp[i], res);
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6,-3,-2,7,-15,1,2,2};
		System.out.println(FindGreatestSumOfSubArray(array));
	}

}
