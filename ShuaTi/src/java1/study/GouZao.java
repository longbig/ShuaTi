package java1.study;
/**
*日期：2018年4月13日 上午11:04:53
*@author 龙
*哦吼吼：GouZao
*描述：父类无无参构造方法，子类调用父类构造的方式
**/
class Father1{
	public Father1(String s) {
		System.out.println("史诗");
	}
}

public class GouZao extends Father1{
	
	public GouZao(String s) {
		super("ce shi");
		System.out.println("勇者");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GouZao("ss");
	}

}
