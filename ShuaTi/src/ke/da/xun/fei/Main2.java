
package ke.da.xun.fei;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(in.nextInt());
		}
		boolean doit = true;
		int count = 0;
		ArrayList<Integer> next = list;
		while (doit) {
			ArrayList<Integer> nextList = new ArrayList<>();
			nextList.add(list.get(0));
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i - 1) <= list.get(i)) {
					nextList.add(list.get(i));
				}
			}
			if (nextList.size() == list.size()) {
				doit = false;
				break;
			} else {
				list = nextList;
				count++;
			}
		}
		System.out.println(count);

	}

}