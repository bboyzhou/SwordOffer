// ����ģʽ
// 1.����ģʽ:��Ҫ��ȥ��������,�̲߳���ȫ
public class Singleton1
{
	// �����Ա����
	private static Singleton1 instance;
	// ����˽�й��캯��
	private Singleton1(){}
	
	// ���巵��ʵ������
	public static Singleton1 getInstance(){
		if(instance==null){
			instance=new Singleton1();
		}
		return instance;
	}
}