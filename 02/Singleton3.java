// 单例模式
// 3.懒汉模式（加同步锁）:需要才去创建对象 ,线程安全
public class Singleton3
{
	// 定义成员变量
	private static Singleton3 instance;
	// 定义私有构造函数
	private Singleton3(){}
	
	// 定义返回实例方法
	public static synchronized Singleton3 getInstance(){
		if(instance==null){
			instance=new Singleton3();
		}
		return instance;
	}
}