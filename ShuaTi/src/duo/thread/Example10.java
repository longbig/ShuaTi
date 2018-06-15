package duo.thread;
/**
*日期：2018年3月27日 下午4:55:14
*@author 龙
*哦吼吼：Example10
*描述：
**/
public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storage st = new Storage();
		Input in = new Input(st);
		Output out = new Output(st);
		new Thread(in).start();
		new Thread(out).start();
	}

}
