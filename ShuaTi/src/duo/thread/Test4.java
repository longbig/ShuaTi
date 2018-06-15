package duo.thread;
/**
*日期：2018年3月27日 上午11:42:42
*@author 龙
*哦吼吼：Test4
*描述：使用继承的方法实现多线程，实际应用题
*输出结果在实际中不合理，因为每个线程独立进行处理，并没有共享资源
**/
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TicketWindow().start();
		new TicketWindow().start();
		new TicketWindow().start();
	}

}

class TicketWindow extends Thread{
	private int tickets = 100;
	public void run() {
		while(true) {
			if(tickets > 0) {
				Thread t3 = Thread.currentThread();
				String name = t3.getName();
				System.out.println("线程 " + name + " 正在发售第：" + tickets-- + "张票");
			}
		}
	}
}
