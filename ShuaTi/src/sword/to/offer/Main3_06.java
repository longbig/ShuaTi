package sword.to.offer;
/**
 * @date 2018年8月27日 下午5:37:55
 * @author 龙
 * 类描述：孩子们的游戏
 */
public class Main3_06 {

    public static int LastRemaining_Solution(int n, int m) {
    	if(n < 1 || m < 0) {
    		return -1;
    	}
    	
        int[] children = new int[n];
        int count = -1; 
        int rest = n;
        int i = 0;
        //计算
        for(; i < n; i++) {
        	if(children[i] == 0) {
        		count++;
        	}
        	if(count == m - 1) {
        		children[i] = 1;
        		rest--;
        		if(rest == 0) {
        			rest = i;
        			break;
        		}
        		count = -1;
        	}
        	if(i == n - 1) 
        		i = -1;
        }
        
        return rest;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int m = 2;
		System.out.println(LastRemaining_Solution(n, m));
	}

}
