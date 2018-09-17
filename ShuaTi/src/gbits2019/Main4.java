package gbits2019;
/**
 * @date 2018年9月3日 下午8:49:57
 * @author 龙
 * 类描述：
 */
public class Main4 {
	public static void main(String[] args) {
		
	}
	public static int getNum(int n, int m) {
        if(n<=1) {
            return 0;
        }
        int[] res = new int[n+1];
        res[0] = 0;
        res[1] = 0;
        for(int i=2;i<=n;i++) {
            if((i&m) == 0) {
                res[i] = res[i/2] + 1;
            }else {
                res[i] = Math.min(res[(i+1)/2], res[(i-1)/2]) + 2;
            }
        }
        return res[n];
}
}
