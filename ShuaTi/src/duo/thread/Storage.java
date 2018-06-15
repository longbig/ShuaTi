package duo.thread;
/**
*日期：2018年3月27日 下午4:31:24
*@author 龙
*哦吼吼：Storage
*描述：定义一个类，并定义向数组中存和取的方法
**/
class Storage {

	private int[] cells = new int[10];
	private int inP,outP, count;
	
	public synchronized void put(int num) {
		try {
			if(count == cells.length) {
				this.wait();
			}
			cells[inP] = num;
			System.out.println("insert into " + cells[inP]);
			inP++;
			if(inP == cells.length) {
				inP = 0;
			}
			count++;
			this.notify();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public synchronized void get() {
		try {
			if(count == 0) {
				this.wait();
			}
			int data = cells[outP];
			System.out.println("取出数据：" + data);
			cells[outP] = 0;
			outP++;
			if(outP == cells.length) {
				outP = 0;
			}
			count--;
			this.notify();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
