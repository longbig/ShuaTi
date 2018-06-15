package nowcoder;

import java.util.Scanner;

/**
*日期：2018年4月3日 下午3:22:18
*@author 龙
*哦吼吼：IsIP
*描述：判断IP地址是否合法
*输入
10.138.15.1
输出
YES
**/
public class IsIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
		String string = scanner.next();
		String[] aa = string.split("\\.");
		
		if(aa.length == 4) {
			int i = 0;
			boolean flag = true;
			for(; i < aa.length; i++) {
				int bb = Integer.parseInt(aa[i]);
				if(bb < 0 || bb > 255) {
					System.out.println("NO");
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("YES");
			}
		}else {
			System.out.println("NO");
		}
	}
	}
}
