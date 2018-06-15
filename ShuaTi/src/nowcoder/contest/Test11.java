package nowcoder.contest;
/**
*日期：2018年5月19日 下午7:40:16
*@author 龙
*哦吼吼：Test11
*描述：
**/
public class Test11 {
	
	public static int func(int n) {
		int last = 0,s = 0,e=0;
		for(int i = 2; i*i <= n;) {
			if(n%i != 0) {
				++i;
				s+=e;
				e=0;
				continue;
			}
			
			n = n/i;
			if(last != i) {
				s+=e;
				e=i;
				last = i;
				continue;
			}
			e*=i;
		}
		if(last != n) {
			s+= e+n;
		}else {
			s+= e*n;
		}
		return s;
	}
	
	public static int foo(int a, int b) {
		int k=0;
		for(int c = a^b;c!=0; c=c>>1) {
			k+= c&1;
		}
		return k;
	}
	
	public static int f(int n, int m) {
		int M = 100;
		int s[] = new int[101];
		if(m > M) {
			return 0;
		}
		for(int j = 0; j<=m; ++j) {
			s[j] = 0;
		}
		s[0] = 1;
		for(int i = 1; i <= n; ++i) {
			for(int j = m; j >=1; --j) {
				if(j>=i)
					s[j] += s[j-i];
			}
		}
		return s[m];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(func(11900));
		System.out.println(foo(1024, 4096));
		System.out.println(f(90, 8));
	}

}
