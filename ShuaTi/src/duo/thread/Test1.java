package duo.thread;
/**
*日期：2018年3月26日 下午9:58:54
*@author 龙
*哦吼吼：Test1
*描述：单线程测试
**/
class MyThread{
	public void run() {
		while(true) {
			System.out.println("Mythread.run() is running...");
		}
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mm = new MyThread();
		mm.run();
		while(true) {
			System.out.println("main() is printing...");
		}
	}

}
