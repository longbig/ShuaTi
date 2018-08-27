package sword.to.offer;
/**
 * @date 2018年8月25日 下午9:44:17
 * @author 龙
 * 类描述：
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
 * 但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。 
 * 数值为0或者字符串不是一个合法的数值则返回0。
 * 
 * 输入一个字符串,包括数字字母符号,可以为空
 * 
 * 如果是合法的数值表达则返回该数字，否则返回0
 * 
 * 输入：+2147483647  1a33
 * 输出：2147483647   0
 */
public class Main3_09 {

    public static int StrToInt(String str) {
    	if(str == null)
        	return 0;
    	
        char[] strArray = str.toCharArray();
        int length = str.length();
        int count = 1;
        int IntNumber = 0;
        //遍历字符串
        for(int i = length - 1; i >= 0; i--) {
        	if(i == 0 && strArray[i] == '+') {
        		return IntNumber;
        	}
        	if(i == 0 && strArray[i] == '-') {
        		return -IntNumber;
        	}
        	
        	if(strArray[i] > '0' && strArray[i] < '9') {
        		IntNumber += ((int)strArray[i] - 48) * count;
        		count *= 10;
        	}else {
        		return 0;
        	}
        }
    	
    	return IntNumber;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StrToInt(""));
	}

}
