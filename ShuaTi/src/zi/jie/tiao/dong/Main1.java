package zi.jie.tiao.dong;

import java.util.Scanner;
import java.util.*;

/**
 * @date 2018年9月9日 上午10:06:09
 * @author 龙
 * 类描述：
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String string = input.next();
		int maxLen = maxLengthNoRepeat(string);
		System.out.println(maxLen);
	}

    private static int maxLengthNoRepeat(String s) {
    	int i = 0, j = 0;
		int ans = 0, len = s.length();
		Set<Character> cc = new HashSet();
		
		while(i < len && j < len) {
			if(!cc.contains(s.charAt(j))) {
				cc.add(s.charAt(j++));
				ans = Math.max(ans, j-i);
			}else {
				cc.remove(s.charAt(i++));
			}
		}
		return ans;
    }

}
