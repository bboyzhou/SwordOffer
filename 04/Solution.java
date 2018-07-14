/*
��Ŀ����
��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
ÿһ�ж����մ��ϵ��µ�����˳�����������һ��������
����������һ����ά�����һ���������ж��������Ƿ��и�������
*/
public class Solution {
    public boolean Find(int target, int [][] array) {
		if(array==null){
			return false;
		}
		//����������
		int rows=array.length;
		int columns=array[0].length;
		// �����½�ѡȡԪ����target�Ƚ�
		int row=rows-1;
		int column=0;
		while(row>=0 && column<=columns-1){
			// Ŀ������½�Ԫ��С�����޳�Ԫ��������
			if(target<array[row][column]){
				row--;
			}
			// Ŀ������½�Ԫ�ش����޳�Ԫ��������
			else if(target>array[row][column]){
				column++;
			}
			// �ҵ���Ԫ��
			else{
				return true;
			}
		}
		return false;
    }
	public static void main(String[] args){
		Solution sol=new Solution();
		int[][] a={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int[][] b=null;
		// 1.�������ҵ�����
		System.out.println(sol.Find(1,a));
		System.out.println(sol.Find(15,a));
		System.out.println(sol.Find(4,a));
		// 2.���������ҵ�����
		System.out.println(sol.Find(0,a));
		System.out.println(sol.Find(16,a));
		System.out.println(sol.Find(5,a));
		// 3.������
		System.out.println(sol.Find(5,b));

	}
}