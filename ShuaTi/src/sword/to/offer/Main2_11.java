package sword.to.offer;
/**
*日期：2018年5月8日 下午2:20:54
*@author 龙
*哦吼吼：Main2_11
*描述：求出1~13的整数中1出现的次数,
*并算出100~1300的整数中1出现的次数？
*为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
*但是对于后面问题他就没辙了。
*ACMer希望你们帮帮他,并把问题更加普遍化,
*可以很快的求出任意非负整数区间中1出现的次数。
*
*分析：
*n位数上可为1，或其他9种数，注意首位不为0；
*使用总的种数 - 没有1的种数 = 有1的种数；
**/
public class Main2_11 {
	
    public static int NumberOf1Between1AndN_Solution(int n) {
        int i, sum = 0;
        for(i = 1; i <= n; i++) {
        	int k = i;
        	while(k != 0) {
        		int temp = k % 10;
        		if(temp == 1) {
        			sum++;
        		}
        		k /= 10;
        	}
        }
        return sum;
    }
    
    //牛客解法
    public static int Numberof1Between(int n) {
    	int count = 0;
    	int bb,i = 1;
    	for(i = 1; i <= n; i*=10) {
    		int a = n/i, b= n % i;
    		if(a % 10 == 1) {
    			bb = 1;
    		}else {
    			bb = 0;
    		}
    		count = count + (a+8) / 10 * i + bb * (b+1);
    	}
    	return count;
    }

    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = NumberOf1Between1AndN_Solution(13);
		System.out.println(x);
		int y = Numberof1Between(13);
		System.out.println(y);
	}

}
