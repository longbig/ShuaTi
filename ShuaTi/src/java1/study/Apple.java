package java1.study;
/**
*日期：2018年3月29日 下午2:17:23
*@author 龙
*哦吼吼：Apple
*描述：自定义泛型
**/
public class Apple<T> {
	
	private T info;
	public Apple(T info) {
		this.info = info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public T getInfo() {
		return this.info;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple<String> aa = new Apple<>("String");
		System.out.println(aa.getInfo());
		Apple<Double> bb = new Apple<>(1.11);
		System.out.println(bb.getInfo());
	}

}
