package sword.to.offer;
/**
 * @date 2018年8月29日 下午6:50:24
 * @author 龙
 * 类描述：正则表达式匹配
 */
public class Main3_12 {

    public static boolean match(char[] str, char[] pattern)
    {
    	if(str == null || pattern == null)
    		return false;
    	int strIndex = 0;
    	int patternIndex = 0;
    	return matchCore(str, strIndex, pattern, patternIndex);
    }
    
	private static boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
		// TODO Auto-generated method stub
		int strLength = str.length;
		int patternLength = pattern.length;
		if(strIndex == strLength && patternIndex == patternLength)
			return true;
		if(patternIndex == patternLength && strIndex != strLength)
			return false;
		//如果pattern的第二个位置是*
		if(patternIndex + 1 < patternLength && pattern[patternIndex + 1] == '*') {
			if((strIndex != strLength && (str[strIndex] == pattern[patternIndex]) || ((strIndex != strLength && pattern[patternIndex] == '.')))) {
				return matchCore(str, strIndex, pattern, patternIndex + 2)
						|| matchCore(str, strIndex + 1, pattern, patternIndex)
						|| matchCore(str, strIndex + 1, pattern, patternIndex + 2);
			}else {
				return matchCore(str, strIndex, pattern, patternIndex + 2);
			}

		}
		//不是*
		if((strIndex != strLength && pattern[patternIndex] == str[strIndex]) || (strIndex != strLength && pattern[patternIndex] == '.')) {
			return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] pattern = {'a','a','.','b','*'};
		char[] str = {'a','a','b','b'};
		System.out.println(match(str, pattern));
	}

}
