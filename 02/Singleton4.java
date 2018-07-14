// 单例模式
// 4.饿汉模式(懒加载)，静态内部类只有通过显式调用 getInstance 方法时，
//	才会显式装载 SingletonHolder 类，从而实例化 instance 
public class Singleton4
{
	// 静态内部类
	private static class SingletonHolder
	{
		// 定义成员变量(私有性无意义，外部类可以访问内部类私有成员)
		static Singleton4 instance=new Singleton4();
	}

	// 定义私有构造函数
	private Singleton4(){}

	// 定义返回实例的方法
	public static Singleton4 getInstance(){
		return SingletonHolder.instance;
	}
}