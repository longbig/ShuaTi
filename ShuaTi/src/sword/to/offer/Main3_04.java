package sword.to.offer;
/**
 * @date 2018年8月24日 下午1:38:27
 * @author 龙
 * 类描述：字符串的反转
 * 
 * 例如，“student. a am I”。
 * 正确的句子应该是“I am a student.”
 */
public class Main3_04 {
	
    public static String ReverseSentence(String str) {
    	String result = new String();
    	if(str == null)
    		return result;
    	int index = str.indexOf(" ");
    	if(index == -1)
    		return str;
    	return ReverseSentence(str.substring(index + 1)) + " " + str.substring(0, index);
    }
    
    public static void main(String[] args) {
		String string = "student. a am I";
		String reString = ReverseSentence(string);
		System.out.println(reString);
	}
}
