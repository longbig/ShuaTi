package nowcoder;
/**
*日期：2018年3月26日 下午3:44:18
*@author 龙
*哦吼吼：TiaoTaiJie
*描述：可以跳一级或二级，跳到n有多少种跳法
**/
public class TiaoTaiJie {
	
	public static int JumpFloor(int target) {
	    int[] tmp = new int[target+1];
	    if(target <= 0) return -1;
	    if(target == 1) return 1;
	    if(target == 2) return 2;
	    else{
	    tmp[1] = 1;
	    tmp[2] = 2;
	    for(int i = 3; i <= target; i++) {
	    	tmp[i] = tmp[i-1] + tmp[i-2];
	    }
	    return tmp[target];
	    }
	}
	
	//牛客上的解法,代码简单，但是时间复杂度较高；
	public static int JumpFloor1(int target) {
		if (target <= 0) {
			return -1;
		} else if (target == 1) {
			return 1;
		} else if (target ==2) {
			return 2;
		} else {
			return JumpFloor(target-1)+JumpFloor(target-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(JumpFloor(1));
		System.out.println(JumpFloor1(4));
	}

}
