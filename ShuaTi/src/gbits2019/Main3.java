package gbits2019;
/**
 * @date 2018年9月3日 下午6:53:56
 * @author 龙
 * 类描述：填空题
 */
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s1 = "iajblcdnef".toCharArray();
		char[] s2 = "aopbctdesrfzx".toCharArray();
		System.out.println(f(s1, s2));
	}
	static int f(int x) {
		x ^= (x>>16);
		x^=(x>>8);
		x^=(x>>4);
		x^= (x>>2);
		x^= (x>>1);
		return (x&1);
	}
	
	public static void dfs(int now, int top, boolean[] flag, int[] ans,int j) {
		if(now >= top) {
			ans[0]++;
			return;
		}
		for(int i = 0; i < top; i++) {
			if(!flag[i]) {
				flag[i] = true;
				dfs(now + 1, top, flag, ans, j);
				flag[i] = false;
			}
		}
	}
	
	public static int fn(int x, int y) {
		int result = 1;
		while(y != 0) {
			if((y & 1 )!= 0) {
				result = result * x;
			}
			y >>= 1;
			x = x*x;
		}
		return result;
	}
	
	public static int f(char[] s1, char[] s2) {
		int[][] c = new int[100][100];
		int n1 = s1.length;
		int n2 = s2.length;
		
		for(int i = 0; i <= n1; ++i) {
			c[i][0] = 0;
		}
		for(int i = 0; i <= n2; ++i)
			c[0][i] = 0;
		for(int i = 1; i <= n1; ++i) {
			for(int j = 1; j <= n2; ++j) {
				if(s1[i-1] == s2[j-1])
					c[i][j] = c[i-1][j-1] + 1;
				else if(c[i][j-1] < c[i-1][j])
					c[i][j] = c[i-1][j];
				else {
					c[i][j] = c[i][j-1];
				}
			}
		}
		return c[n1][n2];
		
	}
	
	

}
