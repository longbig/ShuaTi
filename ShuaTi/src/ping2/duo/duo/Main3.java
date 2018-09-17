package ping2.duo.duo;

import java.util.HashMap;
import java.util.Scanner;

import zhao.gong.zuo.AA;

/**
 * @date 2018年8月30日 下午8:20:37
 * @author 龙
 * 类描述：求a/b的循环体长度以及循环开始的位置
 * 
 * 示例
 *  input:  1 3
 *  output: 1 1
 *  in:  3 7
 *  out  1 6
 *  
 *  in 
 *  
 */
public class Main3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		a %= b;
		if(a == 0) {
			System.out.println(0 + " " + 0);
		}else {
			int count = 0;
			//使用模拟竖式除法的方法，
			//放第一个余数
			map.put(a, 0);
			int find = 0;
			do {
				a = (a * 10) % b;
				//如果发现了和第一个余数相等的数，说明有循环
				if(!map.containsKey(a)) {
					map.put(a, ++count);
			
				}else {
					find = map.get(a);
					find++;
					break;
				}
				
			} while (a != 0);
			
			if(a == 0) {
				System.out.println(count + " " + 0);
			}else {
				System.out.println(find + " " + (count - find + 2));
			}
			
		}
		
	}

}
