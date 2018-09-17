package oppo;
/**
 * @date 2018年9月10日 下午8:28:03
 * @author 龙
 * 类描述：
 */
public class TestOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Office office = new Office();
	     Runnable source = new Producer(office);
	     Runnable sink = new Consumer(office);

	     Thread t1 = new Thread(source);
	     Thread t2 = new Thread(sink);
	     t1.start();
	     t2.start();
	}

}

//办公系统
class Office {
    public int files = 0;
    //放入文件
    public synchronized void push() {
        files++;
    }
    //取出所有文件
    public synchronized void pop() {
        while (files != 0) {
           files--;
        }
    }
    // 显示文件个数
    public synchronized void print() {
    	System.out.println("文件数：" + files);
    }
}

//生产者，业务员类
class Producer implements Runnable {
    private Office office;

    public Producer(Office s) {
        office = s;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                //每生成一个文件，就休眠10min
                office.push();
                System.out.println("业务员生成一个文件，开始休眠10min");
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
        }
    }
}

//消费者，主管
class Consumer implements Runnable {
    private Office office;
    public Consumer(Office s) {
    	office = s;
    }
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                // 每产生一个字符线程就睡眠一下
            	System.out.println("主管审批文件,文件个数："+ office.files + ",  开始休眠15min");
            	office.pop();
            	
                Thread.sleep(1500);
            } catch (Exception e) {
            }
        }
    }
}




