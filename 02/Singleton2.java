// ����ģʽ
// 2.����ģʽ������ؾʹ���ʵ��
public class Singleton2
{
	// ����˽�г�Ա����
	private static Singleton2 instance=new Singleton2();

	// ����˽�й��캯��
	private Singleton2(){}

	// ���巵��ʵ���ķ���
	public static Singleton2 getInstance(){
		return instance;
	}
}