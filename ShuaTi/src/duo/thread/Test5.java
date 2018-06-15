package duo.thread;
/**
*日期：2018年3月27日 上午11:52:12
*@author 龙
*哦吼吼：Test5
*描述：通过实现Runnable接口的方法实现多线程，实现多个进程访问共享资源
**/
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketWindow1 t1 = new TicketWindow1();
		new Thread(t1, "窗口1").start();
		new Thread(t1, "窗口2").start();
		new Thread(t1, "窗口3").start();
	}

}

class TicketWindow1 implements Runnable{
	
	int tickets = 100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread tt = Thread.currentThread();
		String name = tt.getName();
		
		while(true) {
			if(tickets > 0) {
				System.out.println("进程 " + name + "正在发售第：" + tickets-- + "张票");
			}
		}
	}
	
}
