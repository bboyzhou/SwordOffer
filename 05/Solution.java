/*
题目描述
请实现一个函数，将一个字符串中的每个空格替换成“%20”。
例如，当字符串为We Are Happy.则经过替换之后的字符串
为We%20Are%20Happy。
*/
public class Solution {
	// 从后向前复制
    public String replaceSpace(StringBuffer str) {        
		int oldLen=str.length();
		// 输入检查
		if(oldLen==0){
			return "";
		}
		// 统计空格数
		int spaceNum=0;
		for(int i=0;i<oldLen;i++){
			if(str.charAt(i)==' '){
				spaceNum++;
			}
		}
		// 扩容后字符串长度
		int newLen=str.length()+2*spaceNum;
		str.setLength(newLen);
		// 从后向前，替换复制
		int p1=oldLen-1;
		int p2=newLen-1;
		while(p1!=p2){
			// 如果遇到空格，p2向前移3格,p1向前移1格
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
		// 1.字符串中包含空格
		StringBuffer sb1=new StringBuffer(" we are happy.");
		StringBuffer sb2=new StringBuffer("we are happy. ");
		StringBuffer sb3=new StringBuffer("we are happy.");
		StringBuffer sb4=new StringBuffer("we  are happy.");		
		// 2.字符串不包含空格
		StringBuffer sb5=new StringBuffer("we-are-happy");
		// 3.特殊输入测试
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