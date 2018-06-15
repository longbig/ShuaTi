package nowcoder;
/**
*日期：2018年4月3日 下午2:31:43
*@author 龙
*哦吼吼：FinallyTest
*描述：
**/


public class FinallyTest {

	public static int test() {
		// TODO Auto-generated method stub
		int a = 0;
		try {
			return a++;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// TODO: handle finally clause
			return ++a;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(test());
	}

}
