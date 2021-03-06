/*
题目描述
在一个二维数组中，每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，
输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
*/
public class Solution {
    public boolean Find(int target, int [][] array) {
		if(array==null){
			return false;
		}
		//行数，列数
		int rows=array.length;
		int columns=array[0].length;
		// 从左下角选取元素与target比较
		int row=rows-1;
		int column=0;
		while(row>=0 && column<=columns-1){
			// 目标比左下角元素小，则剔除元素所在行
			if(target<array[row][column]){
				row--;
			}
			// 目标比左下角元素大，则剔除元素所在列
			else if(target>array[row][column]){
				column++;
			}
			// 找到该元素
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
		// 1.包含查找的数字
		System.out.println(sol.Find(1,a));
		System.out.println(sol.Find(15,a));
		System.out.println(sol.Find(4,a));
		// 2.不包含查找的数字
		System.out.println(sol.Find(0,a));
		System.out.println(sol.Find(16,a));
		System.out.println(sol.Find(5,a));
		// 3.空数组
		System.out.println(sol.Find(5,b));

	}
}