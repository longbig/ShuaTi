package nowcoder.contest;

import java.util.Scanner;

/**
*日期：2018年4月14日 下午12:13:47
*@author 龙
*哦吼吼：LL
*描述：
*链接：https://www.nowcoder.com/acm/contest/96/A
来源：牛客网

 qwb为了检验你是否是真正的程序猿，决定出道题考考你：现在程序会输入一行字符串，如果恰好是lovelive（不区分大小写）就输出yes，否则输出no。
输入描述:
输入有多组（组数不超过100），每组输入一行字符串（字符串长度不超过100）。
输出描述:
输出占一行，如果输入符合要求则输出yes，否则输出no。
示例1
输入
longlong
LoveLive
love live
输出
no
yes
no
**/
public class LL {
	
	//测试方法
	public static boolean isll(String str) {
		int i;
		if((str.charAt(0) == 'L' || str.charAt(0) == 'l')
			&& (str.charAt(1) == 'o' || str.charAt(1) == 'O')
			&& (str.charAt(2) == 'v' || str.charAt(2) == 'V')
			&& (str.charAt(3) == 'E' || str.charAt(3) == 'e')
			&& (str.charAt(4) == 'L' || str.charAt(4) == 'l')
			&& (str.charAt(5) == 'i' || str.charAt(5) == 'I')
			&& (str.charAt(6) == 'v' || str.charAt(6) == 'V')
			&& (str.charAt(7) == 'e' || str.charAt(7) == 'E')
				) {
			return true;
		}else {
			return false;
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			String ss = scanner.nextLine();
			if(isll(ss)) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

}
