// 题目二: 不修改数组找出重复的数字
// 问题描述：长度为n+1的数组里所有数字都在1~n,
// 找出任意一个重复数字，不能修改输入数组

public class Solution1
{
	// Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    // Return value:   any duplication in the array number
	public int getDuplication(final int[] numbers,int length){
		if(numbers==null || length<=0){
			return -1;
		}
		int start=1;
		int end=length-1;
		//[start,middle],(middle,end]
		while(end>=start){
			int middle=(end-start)/2+start;
			// 计算在numbers数组中[start,middle]之间数字的个数
			int count=countRange(numbers,length,start,middle);
			// 判断是否找到重复数
			if(end==start){
				if(count>1){
					return start;
				}
				else{
					return -1;
				}
			}
			// 如果数的个数大于区间长度，则重复数一定在[start middle]内
			if(count>middle-start+1){
				end=middle;
			}
			else{
				start=middle+1;
			}
		}
		// 如若未发现重复数,返回-1
		return -1;
	}
	// Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    start:       the minimum to search 
    //    end:		   the maxmum to search
    // Return value:   the number in range of [strat end] from numbers
	private int countRange(final int[] numbers,int length,int start,int end){

		int count=0;
		for(int i=0;i<length;i++){
			if(numbers[i]>=start && numbers[i]<=end){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args){
		Solution1 sol=new Solution1();
		int[] arr={2,3,5,4,3,2,6,7};
		int[] arr1={2,3,5,4,8,1,6,7};
		int[] arr2=null;
		//包含重复数字
		System.out.println(sol.getDuplication(arr,8));
		// 不包含重复数字
		System.out.println(sol.getDuplication(arr1,8));
		// 输入数组为空
		System.out.println(sol.getDuplication(arr2,0));
	}
}