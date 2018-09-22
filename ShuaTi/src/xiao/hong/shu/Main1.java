package xiao.hong.shu;

import java.util.Scanner;

/**
 * @date 2018年9月18日 下午7:10:22
 * @author 龙
 * 类描述：
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String string = input.next();
		int[] arrays = new int[100];
		char[] chs = new char[100];
		int j = 0;
		chs[0] = string.charAt(0);
		for(int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if(!Character.isLetter(ch))
				continue;
			
			if(chs[j] != string.charAt(i)) {
				chs[++j] = string.charAt(i);
				arrays[j]++;
			}
			else
				arrays[j]++;
		}
		//output
		for(int i = 0; i < arrays.length; i++) {
			if(arrays[i] != 0) {
				if(arrays[i] != 1) {
					System.out.print(arrays[i] - 1);
					System.out.print(chs[i]);
				}
				if(arrays[i] == 1) {
					System.out.print(chs[i]);
				}
			}
		}
	}

}
