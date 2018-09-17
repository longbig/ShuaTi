package yin.lian;
/**
 * @date 2018年9月11日 下午6:58:03
 * @author 龙
 * 类描述：银联笔试题
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method(0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main");
		}
		System.out.println("finished");
		
	}
	
	public static int method(int i) throws Exception{
		try {
			return 100 / i;
		} catch (Exception e) {
			throw new Exception("Method");
			// TODO: handle exception
		}finally {
			System.out.println("finally");
		}
	}

}
