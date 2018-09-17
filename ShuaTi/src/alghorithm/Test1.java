package alghorithm;


public class Test1{
	public static void main(String[] args) {
		int[] array = {1,2,3,66,44,3};
		new Test1().findOne(array);
	}
	
	public void findOne(int[] array) {
		//建立一个下标是1-100的数组，遍历array，将array[i]的值作为新数组下标，
		//并将该下标对应的值设置为1，如果该值已经是1了，那么下标就是重复的数
		int[] newArray = new int[101];
		int result = 0;
		for(int i = 0; i < array.length; i++) {
			//让下标和值对应，所以加1
			if(newArray[array[i]] == 0) {
				newArray[array[i]] = 1;
			}else {
				result = array[i];
			}
		}
		System.out.println(result);
	}
}

