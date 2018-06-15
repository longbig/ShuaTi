package leetcode.easy;
/**
*日期：2018年3月28日 下午8:11:49
*@author 龙
*哦吼吼：Reverse
*描述：输入一个数，将其反向输出，如 -123 输出为：-321
* 注意规律：res = res * 10 + x%10;
* 			x /= 10;
* 		这样就反转了！！！
**/
public class Reverse {
	
	 public int reverse(int x) {
		 int result = 0;
		 while(x != 0) {
			 int tail = x % 10;
			 int newresult = result * 10 + tail;
			 if((newresult - tail) / 10 != result) {
				 return 0;
			 }
			 result = newresult;
			 x /= 10;
		 }
		 System.out.println(result);
		 return result;
	 }
	 
	 public static void main(String[] args) {
		 new Reverse().reverse(-123);
		 
	 }
}
