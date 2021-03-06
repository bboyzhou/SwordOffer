// 单例模式
// 1.懒汉模式:需要才去创建对象,线程不安全
public class Singleton1
{
	// 定义成员变量
	private static Singleton1 instance;
	// 定义私有构造函数
	private Singleton1(){}
	
	// 定义返回实例方法
	public static Singleton1 getInstance(){
		if(instance==null){
			instance=new Singleton1();
		}
		return instance;
	}
}