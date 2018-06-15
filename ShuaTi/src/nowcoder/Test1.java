package nowcoder;/**
*日期：2018年4月9日 下午8:10:42
*@author 龙
*哦吼吼：Test1
*描述：
*题目描述
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
**/
public class Test1 {
		/**
		 * 1.全面考察指数的正负、底数是否为零等情况。
		 * 2.写出指数的二进制表达，例如13表达为二进制1101。
		 * 3.举例:10^1101 = 10^0001*10^0100*10^1000。
		 * 4.通过&1和>>1来逐位读取1101，为1时将该位代表的乘数累乘到最终结果。
		 */
	public double Power(double base, int exponent) {
		double res = base;
		double cur = 1;
		int n;
		if(exponent > 0) {
			n = exponent;
		}else if(exponent == 0) {
			return 1;
		}else {
			if(base == 0) {
				throw new RuntimeException("底数不能为0");
			}else {
				n = -exponent;
			}
		}
		//start
		while(n != 0) {
			if((n & 1) == 1) {
				cur *= res;
			}
			res *= base;
			n >>= 1;
		}
		
		return exponent > 0 ? res:(1/res);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Test1().Power(0, 0));
	}

}
