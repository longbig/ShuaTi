package nowcoder;

/*
 * 求最长重叠子串，
 * 思路：从字符串的中间划分，一定是偶数长度，左右一样即可，长度取最大；
 * 
 */
public class MaxSubString{
	public static void main(String[] args) {
		String data = "dasdfasdfwerfjljldjfgvivovivodiejsdsdsdsd";
		int i, j, ii=0,jj=0,ll = 0, max = 0;
		int length = data.length();
		//从两头开始往中间缩进
		for(i = 0; i < length - 1; i++) {
			for(j = length-1; j > i; j--) {
				//子串长度是偶数
				if((j - i + 1) % 2 == 0) {
					int mid = (j+i)/2;
					String ss1 = data.substring(i, mid+1);
					String ss2 = data.substring(mid+1, j+1);
					if(ss1.equals(ss2)) {
						ll = ss1.length();
						if(ll > max) {
							max = ll;
							ii = i;
							jj = j;
						}
					}
				}
				
			}
		}
		String result = data.substring(ii, jj+1);
		System.out.println(result);
	}
}

