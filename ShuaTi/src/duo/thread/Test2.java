package duo.thread;
/**
*日期：2018年3月27日 上午10:40:19
*@author 龙
*哦吼吼：Test2
*描述：多线程测试
**/

class MyThread1 extends Thread{
	public void run() {
		while(true) {
			System.out.println("MyThread running......");
		}
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 mm = new MyThread1();
		mm.start();
		while(true) {
			System.out.println("main running...");
		}
	}

}
