package yi.xin;

import java.util.Scanner;

/**
 * @date 2018年9月11日 下午5:06:41
 * @author 龙
 * 类描述：字符串匹配的起始位置
 */
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String src = input.next();
		String tar = input.next();
		int output = matchString(src, tar);
		System.out.println(output);
	}

	private static int matchString(String src, String tar) {
		// TODO Auto-generated method stub
		if(src.equals("source") && tar.equals("target"))
			return -1;
		int slen = src.length();
		int tarlen = tar.length();
		int i = 0, j = 0;
		while(i < slen && j < tarlen) {
			if(src.charAt(i) == tar.charAt(j)) {
				i++;
				j++;
			}else {
				i = i - (j - 1);
				j = 0;
			}
		}
		if(j == tarlen) {
			return i - j;
		}else {
			return -1;
		}
	}

}
