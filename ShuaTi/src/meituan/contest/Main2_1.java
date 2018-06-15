package meituan.contest;

import java.util.Scanner;

/**
*日期：2018年6月9日 下午7:46:49
*@author 龙
*哦吼吼：Main2_1
*描述：初赛第一题
**/
public class Main2_1 {
	static int x,y;
	
	//直接判断x,y的值即可
	public static int[] what(char ch) {
		int[] array = new int[2];
		switch (ch) {
		case '@':
		case '!':
		case ':':
			x = 0;y=0;
			break;
		case 'A':
		case 'B':
		case 'C':
			x=0;y=1;
			break;
		case 'D':
		case 'E':
		case 'F':
			x = 0;y=2;
			break;
		case 'G':
		case 'H':
		case 'I':
			x= 1; y = 0;
			break;
		case 'J':
		case 'K':
		case 'L':
			x=1;y=1;
			break;
		case 'M':
		case 'N':
		case 'O':
			x=1;y=2;
			break;
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			x=2;y=0;
			break;
		case 'T':
		case 'U':
		case 'V':
			x=2;y=1;
			break;
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			x=2;y=2;
			break;
		default:
			break;
		}
		array[0] = x;
		array[1] = y;
		return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] output = new int[n];
		int[] a1 = new int[2];
		int[] a2 = new int[2];
		int count = 0;
		for(int i = 0; i < n; i++) {
			String string = scanner.next();
			int length = string.length();
			count = 0;
			char cc1 = string.charAt(0);
			a1 = what(cc1);
			count = a1[0] + a1[1];
			for(int j = 0; j < length-1; j++) {
				char c1 = string.charAt(j);
				char c2 = string.charAt(j+1);
				a1 = what(c1);
				a2 = what(c2);
				count += Math.abs(a1[0] - a2[0]) + Math.abs(a1[1] - a2[1]);
			}
			output[i] = count;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(output[i]);
		}
		
		
	}

}
