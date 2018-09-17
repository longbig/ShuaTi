package zi.jie.tiao.dong;

import java.util.Scanner;

/**
 * @date 2018年9月9日 上午10:19:18
 * @author 龙
 * 类描述：去除.之后的IP还原可能种数
 */
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String data = input.next();
		//长度判断
		int count = allPossible(data);
		System.out.println(count);
	}

	private static int allPossible(String data) {
		// TODO Auto-generated method stub
		if(data == null || data.length() < 4 || data.length() > 12)
			return 0;
		//正则规则
		String regex = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."
						+ "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
						+ "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
						+ "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
		int count = 0;
		//字符串加上点号
		for(int i = 0; i < data.length() - 3; i++) {
			String newString1 = data.substring(0, i + 1) + ".";
			
			for(int j = i + 1; j < data.length() - 2; j++) {
				String newString2 = newString1 + data.substring(i + 1,j + 1) + ".";
				for(int k = j + 1; k < data.length() - 1; k++) {
					String newString3 = newString2 + data.substring(j + 1, k + 1) + "." + data.substring(k + 1);
//					System.out.println(newString3);
					
					
					if(newString3.matches(regex)) {
						count++;
					}
				}
			}
		}
		return count;
		
	}

}
