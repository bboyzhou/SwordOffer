public class Test
{
	public static void main(String[] args){
		Singleton1 instance1=Singleton1.getInstance();
		Singleton1 instance2=Singleton1.getInstance();
		System.out.println(instance1==instance2);
	}
}