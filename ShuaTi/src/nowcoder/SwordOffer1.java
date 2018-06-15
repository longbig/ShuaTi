package nowcoder;
/**
*日期：2018年4月13日 上午11:41:08
*@author 龙
*哦吼吼：SwordOffer1
*描述：不使用四则运算，计算两数之和；
*方法：
*使用 & << | ^    与、左移、或、异或运算进行
**/
public class SwordOffer1 {
	
	public int Add(int num1,int num2) {
		int n1 = (num1 & num2) << 1;
		int n2 = num1 ^ num2;
		while((n1 & n2) != 0) {
			num1 = n1;
			num2 = n2;
			n1 = (num1 & num2) << 1;
			n2 = (num1 ^ num2);
		}
		return n1 | n2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = new SwordOffer1().Add(5, 11);
		System.out.println(res);
	}

}
