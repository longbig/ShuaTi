package duo.thread;
/**
*日期：2018年3月27日 下午4:51:16
*@author 龙
*哦吼吼：Output
*描述：
**/
class Output implements Runnable{
	
	private Storage st;
	private int data = 10;
	public Output(Storage st1) {
		// TODO Auto-generated constructor stub
		this.st = st1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			st.get();
		}
	}

}
