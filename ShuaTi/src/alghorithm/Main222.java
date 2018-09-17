package alghorithm;
/**
*日期：2018年4月28日 下午2:04:32
*@author 龙
*哦吼吼：Main222
*描述：
**/
public class Main222 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F1[] test = new APP[10];
		test[0] = new APP();
		test[1] = new Jo();
		try {
			test[0] = new F1();
			System.out.println("1");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("2");
		}
		
		try {
			test[0] = new Or();
			System.out.println("3");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("4");
		}
	}

}

class F1{}
class APP extends F1{}
class Jo extends APP{}
class Or extends F1{}
