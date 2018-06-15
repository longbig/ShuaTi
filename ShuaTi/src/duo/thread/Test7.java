package duo.thread;
/**
*日期：2018年3月27日 下午2:23:47
*@author 龙
*哦吼吼：Test7
*描述：线程的优先级设置，以及抢占式的调度
**/
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowThread ll = new LowThread();
		HighThread hh = new HighThread();
		Thread ll1 = new Thread(ll, "low");
		Thread hh1 = new Thread(hh, "high");
		ll1.setPriority(10);
		hh1.setPriority(5);
		hh1.start();
		ll1.start();
	
	}

}

class LowThread implements Runnable{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " 低线程正在运行。。。");
		}
	}
}

class HighThread implements Runnable{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " 高线程运行中...");
		}
	}
}
