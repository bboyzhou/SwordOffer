/*
��Ŀ����
��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���
ΪWe%20Are%20Happy��
*/
public class Solution {
	// �Ӻ���ǰ����
    public String replaceSpace(StringBuffer str) {        
		int oldLen=str.length();
		// ������
		if(oldLen==0){
			return "";
		}
		// ͳ�ƿո���
		int spaceNum=0;
		for(int i=0;i<oldLen;i++){
			if(str.charAt(i)==' '){
				spaceNum++;
			}
		}
		// ���ݺ��ַ�������
		int newLen=str.length()+2*spaceNum;
		str.setLength(newLen);
		// �Ӻ���ǰ���滻����
		int p1=oldLen-1;
		int p2=newLen-1;
		while(p1!=p2){
			// ��������ո�p2��ǰ��3��,p1��ǰ��1��
			if(str.charAt(p1)==' '){
				str.setCharAt(p2--,'0');
				str.setCharAt(p2--,'2');
				str.setCharAt(p2--,'%');
				p1--;
			}
			else{
				str.setCharAt(p2--,str.charAt(p1));
				p1--;
			}
		}
		return str.toString();
    }
	public static void main(String[] args){
		Solution sol=new Solution();
		// 1.�ַ����а����ո�
		StringBuffer sb1=new StringBuffer(" we are happy.");
		StringBuffer sb2=new StringBuffer("we are happy. ");
		StringBuffer sb3=new StringBuffer("we are happy.");
		StringBuffer sb4=new StringBuffer("we  are happy.");		
		// 2.�ַ����������ո�
		StringBuffer sb5=new StringBuffer("we-are-happy");
		// 3.�����������
		StringBuffer sb6=new StringBuffer("");
		StringBuffer sb7=new StringBuffer(" ");
		StringBuffer sb8=new StringBuffer("  ");

		System.out.println(sol.replaceSpace(sb1));
		System.out.println(sol.replaceSpace(sb2));
		System.out.println(sol.replaceSpace(sb3));
		System.out.println(sol.replaceSpace(sb4));
		System.out.println(sol.replaceSpace(sb5));
		System.out.println(sol.replaceSpace(sb6));
		System.out.println(sol.replaceSpace(sb7));
		System.out.println(sol.replaceSpace(sb8));
	}
}