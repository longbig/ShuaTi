package java1.study;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.sun.corba.se.spi.orb.StringPair;

/**
*日期：2018年4月11日 下午3:45:02
*@author 龙
*哦吼吼：ExtendedObjectPoolFactory
*描述：反射机制调用方法
**/
public class ExtendedObjectPoolFactory {

	private Map<String, Object> objectPool = new HashMap();
	private Properties config = new Properties();
	
	public void init(String filename) {
		try {
			FileInputStream fin = new FileInputStream(filename);
			config.load(fin);
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("read " + filename + "failed");
		}
	}
	//定义创建对象的方法
	//传入字符串类名，创建Java对象
	private Object createObject(String clazzName) throws 
	  InstantiationException, IllegalAccessException, ClassNotFoundException{
		Class<?> clazz = Class.forName(clazzName);
		return clazz.newInstance();
	}
	
	//根据配置文件创建对象
	public void initPool() throws InstantiationException,
		IllegalAccessException,ClassNotFoundException{
		for(String name : config.stringPropertyNames()) {
			if(!name.contains("%")) {
				objectPool.put(name, createObject(config.getProperty(name)));
			}
		}
	}
	
	//根据属性文件来调用对象的setter方法
	public void initProperty() throws InvocationTargetException,
		IllegalAccessException,NoSuchMethodException{
		for(String name : config.stringPropertyNames()) {
			if(name.contains("%")) {
				String[] objAndProp = name.split("%");
				Object target = getObject(objAndProp[0]);
				String mtdName = "set" + objAndProp[1].substring(0,1).toUpperCase()
						+objAndProp[1].substring(1);
				Class<?> targetClass = target.getClass();
				//获取调用的setter方法
				Method mtd = targetClass.getMethod(mtdName, String.class);
				//将config里的值作为调用setter方法的参数
				mtd.invoke(target, config.getProperty(name));
			}
		}
	}
	
	public Object getObject(String name) {
		return objectPool.get(name);
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ExtendedObjectPoolFactory epf = new ExtendedObjectPoolFactory();
		epf.init("extObj.txt");
		epf.initPool();
		epf.initProperty();
		System.out.println(epf.getObject("a"));
	}

}
