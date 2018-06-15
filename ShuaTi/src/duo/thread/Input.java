package duo.thread;
/**
*日期：2018年3月27日 下午4:48:08
*@author 龙
*哦吼吼：Input
*描述：实现Input和Output同时访问Storage
**/
class Input implements Runnable{
	
	private Storage st;
	private int num;
	private int data = 10;
	
	public Input(Storage st1) {
		// TODO Auto-generated constructor stub
		this.st = st1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			st.put(num++);
		}
	}

}
