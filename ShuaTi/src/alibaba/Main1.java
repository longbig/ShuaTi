package alibaba;

import java.util.*;
/**
 * @date 2018年9月7日 下午7:55:06
 * @author 龙
 * 类描述：
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(JumpFloorII(9));
	}
	
	public static int JumpFloorII(int target) {
	    int[] dp = new int[target];
	    Arrays.fill(dp, 1);
	    for (int i = 1; i < target; i++)
	        for (int j = 0; j < i; j++)
	            dp[i] += dp[j];
	    return dp[target - 1];
	}
}
