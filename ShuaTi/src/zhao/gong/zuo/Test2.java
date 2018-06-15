package zhao.gong.zuo;
/**
*日期：2018年3月13日 上午10:43:30
*@author 龙
*哦吼吼：Test2
*描述：做Java练习的一些小知识点
**/
public class Test2 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first
		String string = new String("hello");
		if(string == "hello") {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		//接上面那个，测第二种
		String ss = "hello";
		if(ss == "hello") {
			System.out.println("true");
		}
		
		//多线程
		Test2 t1 = new Test2();
		Test2 t2 = new Test2();
		t1.start();
		System.out.println("t1.start()");
		t2.start();
		System.out.println("t2.start()");
		
	}
	
	public void run() {
		System.out.println("run()");
	}

}
