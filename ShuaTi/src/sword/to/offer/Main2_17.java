package sword.to.offer;
/**
*日期：2018年7月6日 下午5:00:00
*@author 龙
*哦吼吼：Main2_17
*描述：统计一个数字在排序数组中出现的次数
**/
public class Main2_17 {
	
    public static int GetNumberOfK(int [] array , int k) {
        int length = array.length;
        if(length == 0)
        	return 0;
        
        int count = 0;
		for(int i = 0; i < length; i++) {
        	if(array[i] == k)
        		count ++;
        }
        return count;
    }
    
    //因为数组是有序的，所以用到二分查找，确定k-0.5和k+0.5应该插入的位置
    //位置相减即为所求
    public static int GetNumberOfK1(int [] array , int k) {
    	return theIndexOfK(array, k+0.5) - theIndexOfK(array, k-0.5);
    }
    
	private static int theIndexOfK(int[] array, double d) {
		// TODO Auto-generated method stub
		//二分插入法
		int start = 0;
		int end = array.length - 1;
		int mid;
		while(start <= end) {
			mid = start + (end - start) / 2;
			if(d > array[mid]) {
				start = mid + 1;
			}
			if(d < array[mid]) {
				end = mid - 1;
			}
		}
		return end;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,1,2,3,3,3,3};
		int k = 3;
		System.out.println(GetNumberOfK1(array, k));
	}

}
