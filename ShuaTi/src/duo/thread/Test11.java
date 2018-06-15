package duo.thread;
/**
*日期：2018年3月27日 下午3:40:23
*@author 龙
*哦吼吼：Test11
*描述：线程安全问题
*使用synchronized(lock){
*		...
*	}
*同步代码块改进
**/
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tt ttt = new Tt();
		new Thread(ttt, "窗口1").start();
		new Thread(ttt, "窗口2").start();
		new Thread(ttt, "窗口3").start();
		new Thread(ttt, "窗口4").start();
	}

}

class Tt implements Runnable{
	private int tickets = 100;
	Object lock = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (lock) {
			
		while(true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("????");
			}
			if(tickets > 0) {
			System.out.println(Thread.currentThread().getName() + "正在发售第：" + tickets-- + "张票"); 
			}else {
				break;
			}
		}
		}
	}
}
