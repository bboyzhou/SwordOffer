
// 单例模式
// 5.
// 双检锁/双重校验锁（DCL，即 double-checked locking）
public class Singleton5
{
	// 定义私有成员变量
	private volatile static Singleton5 instance;//volatile 保证代码执行有序性

	// 定义私有构造函数
	private Singleton5(){}

	// 定义返回实例的方法
	public static Singleton5 getInstance(){
		// 第一次检查确保是空对象
		if(instance==null){
			synchronized(Singleton5.class){
				// 第二次检查 确保只创建一个实例
				if(instance==null){
					instance=new Singleton5();
				}
			}
		}
		return instance;
	}
}