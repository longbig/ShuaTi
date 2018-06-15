package duo.thread;
/**
*日期：2018年3月27日 上午11:35:49
*@author 龙
*哦吼吼：Test3
*描述：通过实现Runnable接口实现多线程；
**/

class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Runnable is run.......");
		}
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 mm2 = new MyThread2();
		Thread t2 = new Thread(mm2);
		t2.start();
		while(true) {
			System.out.println("main is running..");
		}
	}

}
