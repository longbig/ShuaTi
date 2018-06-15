package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
*日期：2018年4月17日 下午2:01:46
*@author 龙
*哦吼吼：LengthOfSubstring_3
*描述：
*Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. 

Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
**/
public class LengthOfSubstring_3 {
	
	//直接最暴力的方法，O(n2)
	public int lengthOfLongestSubstring(String s) {
		int i, j, ans = 0;
		int len = s.length();
		for(i = 0; i < len; i++) {
			for(j = i+1; j <= len; j++) {
				if(uniqueue(s, i, j)) {
					ans = Math.max(ans, j-i);
				}
			}
		}
		return ans;
	}
	
	//先定义一个方法，用于测试子字符串是否有重复元素
	public boolean uniqueue(String s, int start, int end) {
		Set<Character> ss = new HashSet<>();
		for(int i = start; i < end; i++) {
			Character ch = s.charAt(i);
			if(ss.contains(ch)) {
				return false;
			}
			ss.add(ch);
		}
		return true;
	}
	
	
	//暴力方法会超时，我们使用滑动窗口的方法，当无重复元素时，j一直右移，
	//遇到重复元素，i开始左移，直到重复元素移除
	public int lengthOfLongestSubstring_1(String s) {
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthOfSubstring_3 test = new LengthOfSubstring_3();
		System.out.println(test.lengthOfLongestSubstring_1("abcdecfghi"));
	}

}
