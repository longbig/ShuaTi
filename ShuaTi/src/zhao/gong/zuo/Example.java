package zhao.gong.zuo;
/**
*日期：2018年3月25日 下午4:18:20
*@author 龙
*哦吼吼：Example
*描述：测试是否改变了值
**/
public class Example{
    String str=new String("tarena");
    char[]ch={'a','b','c'};
    public static void main(String args[]){
        Example ex=new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char[] ch){
   //引用类型变量，传递的是地址，属于引用传递。
        str="test ok";
        ch[0]='g';
    }
    
    public int cc() {
    	return 1;
    }
    public String cc(int a) {
    	return "1";
    }
}