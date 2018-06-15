package duo.thread;
/**
*日期：2018年3月27日 下午1:37:11
*@author 龙
*哦吼吼：Test6
*描述：后台线程
*可以发现在只有后台线程运行时，进程会结束
**/

class HouThread implements Runnable{
	public void run() {
		while(true) {
			System.out.println("后台线程正在运行。。。");
		}
	}
}

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main 线程是否是后台：" + Thread.currentThread().isDaemon());
		HouThread ht = new HouThread();
		Thread t6 = new Thread(ht, "t6");
		System.out.println("t6 默认是后台吗？ " + t6.isDaemon());
		t6.setDaemon(true);
		t6.start();
		System.out.println("输出测试");
		
	}

}
