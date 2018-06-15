package duo.thread;
/**
*日期：2018年3月27日 下午2:57:00
*@author 龙
*哦吼吼：Test8
*描述：线程休眠
**/
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread tt = new Thread(new SleepThread(), "Sleepthread 1");
		tt.start();
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				try {
					System.out.println("主线程将休眠5s...");
					Thread.sleep(5000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			System.out.println("主线程的输出：" + i);
		}
	}

}

class  SleepThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			if(i == 3) {
				try {
					Thread.sleep(2000);
					System.out.println("休眠2s后输出 " + i);
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("间断异常！！！");
				}
			}
			System.out.println("输出 " + i);
		}
	}
	
}