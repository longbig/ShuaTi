package alghorithm.util;
/**
*日期：2018年3月28日 下午2:52:51
*@author 龙
*哦吼吼：GCD
*描述：求最大公约数的方法，Greatest Common Divisor
*这里使用递归的辗转相减法
**/
public class GCD {
	
	//辗转相减法有点问题
	public int gcd(int num1, int num2) {
		if(num1 > num2) {
			return gcd(num1 - num2, num2);
		}else if(num1 < num2) {
			return gcd(num1, num1 - num2);
		}else {
			return num1;
		}
	}
	
	//这个是辗转相除法
	public int gcd2(int a, int b) {
		if(a < b) {
			return gcd2(b, a);
		}else if(b == 0) {
			return a;
		}else {
			return gcd2(b, a % b);
		}
	}
}
