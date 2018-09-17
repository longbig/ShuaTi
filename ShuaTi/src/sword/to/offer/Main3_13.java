package sword.to.offer;
/**
 * @date 2018年8月27日 下午7:24:35
 * @author 龙
 * 类描述：表示数值的字符串
 * 字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值
 */
public class Main3_13 {
	 
    //使用正则表达式匹配的方法
    public static boolean isNumeric(char[] str) {
    	String ss = String.valueOf(str);
    	return ss.matches("[\\-+]?[0-9]*(\\.[0-9]+)?([eE][\\-+]?[0-9]+)?");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ss = {'-','3','.','4','e','-','1','4'};
		System.out.println(isNumeric(ss));
	}

}
