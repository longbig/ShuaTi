package yuan.jing;

import java.util.ArrayList;

/**
 * @date 2018年9月5日 下午8:58:05
 * @author 龙
 * 类描述：leetcode 89
 */
public class Main1 {
	
	public ArrayList<Integer> grayCode(int n){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < Math.pow(2, n); i++) {
			list.add((i >> 1) ^ i);
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
