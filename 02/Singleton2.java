// 单例模式
// 2.饿汉模式，类加载就创建实例
public class Singleton2
{
	// 定义私有成员变量
	private static Singleton2 instance=new Singleton2();

	// 定义私有构造函数
	private Singleton2(){}

	// 定义返回实例的方法
	public static Singleton2 getInstance(){
		return instance;
	}
}