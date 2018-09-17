package alghorithm;
/**
 * @date 2018年9月9日 下午7:05:37
 * @author 龙
 * 类描述：
 */
public class Test44 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(fun1());
	}
	
	public static String fun1() {
		try {
			System.out.println("A");
			return fun2();
		} finally {
			System.out.println("B");
		}
	}
	
	public static String fun2() {
		System.out.println("C");
		return "D";
	}

}

