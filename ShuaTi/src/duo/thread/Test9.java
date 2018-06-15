package duo.thread;
/**
*日期：2018年3月27日 下午3:13:25
*@author 龙
*哦吼吼：Test9
*描述：线程让步测试
**/
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldThread y1 = new YieldThread("y1");
		YieldThread y2 = new YieldThread("y2");
		y1.start();
		y2.start();
	}

}

class YieldThread extends Thread{
	public YieldThread(String name) {
		super(name);
	}
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "让步线程输出：" + i);
			if(i== 5) {
				System.out.println(Thread.currentThread().getName() + "线程让步了哦");
				Thread.yield();
			}

		}
	}
}
