package duo.thread;
/**
*日期：2018年3月27日 下午3:26:55
*@author 龙
*哦吼吼：Test10
*描述：线程插队
**/
public class Test10 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Thread jt = new Thread(new JoinThread(), "插队线程");
		jt.start();
		for(int i = 0; i < 9; i++) {
			System.out.println(Thread.currentThread().getName() + "线程output:" + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			if(i == 4) {
				System.out.println("线程插队了！！！");
				jt.join();
			}
		}
	}

}

class JoinThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "线程输出：" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
}
