package yuan.jing;
/**
 * @date 2018年9月5日 下午9:13:16
 * @author 龙
 * 类描述：leetcode 77
 */

import java.util.ArrayList;

public class Main2 {
	public ArrayList<ArrayList<Integer> > combine(int n, int k){
		ArrayList<ArrayList<Integer> > res = new ArrayList<>();
		helper(res, n, k, new ArrayList<Integer>(), 1);
		return res;
	}
	
	private void helper(ArrayList<ArrayList<Integer>> res, int n, int k, ArrayList<Integer> list,int index){
        if(list.size() == k){
                res.add(new ArrayList<Integer>(list));
                return;
            }
        for(int i=index;i<=n;i++){
                list.add(i);
                helper(res,n,k,list,i+1);
                list.remove(list.size()-1);
            }
    }
}
