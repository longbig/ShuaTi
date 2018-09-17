package tencent;
/**
 * @date 2018年8月31日 下午8:56:24
 * @author 龙
 * 类描述：
 */
import java.util.*;
public class TestMoni{
    
    static final int mod = 1000000007;
    
    public static void main(String[] args){
    	int[][] c = new int[105][105];
        c[0][0] = 1;
        for(int i = 1; i <= 100; i++){
            c[i][0] = 1;
            for(int j = 1; j <= 100; j++){
                c[i][j] = (c[i-1][j-1] + c[i-1][j]) % mod;
            }
        }
        
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int a = input.nextInt();
        int x = input.nextInt();
        int b = input.nextInt();
        int y = input.nextInt();
        long ans = 0;
        for(int i = 0; i <= x; i++){
            if(i*a <= k && (k-a*i) % b == 0 && (k-a*i)/b <= y){
                ans = (ans + (c[x][i]*c[y][(k-a*i)/b]) % mod) % mod;
            }
        }
        System.out.println(ans);
        
    }

}
