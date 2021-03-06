public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
	//    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication){
		//输入检查
		if(numbers==null || length<=0 || length!=numbers.length){
			return false;
		}
		for(int i=0;i<length;i++){
			if(numbers[i]<0 || numbers[i]>=length){
				return false;
			}
		}

		// 遍历数组
		for(int i=0;i<length;i++){
			//判断当前位置下标是否与当前值相等
			while(numbers[i]!=i){
				//若不相等,则比较numbers[numbers[i]]和numbers
				if(numbers[i]==numbers[numbers[i]]){
					// 若相等，则找到重复的数
					duplication[0]=numbers[i];
					return true;
				}
				else{
					// 若不等，则交换这两个元素位置，将numbers[i]放在合适位置
					int temp=numbers[i];
					numbers[i]=numbers[temp];
					numbers[temp]=temp;
				}
			}
		}
		// 若没找到重复元素 ，返回false
		return false;
    }
	// 测试
	public static void main(String[] args){
		int[] arr={2,3,1,0,2,5,3};
		int[] arr1={0,1,2,3,4,5,6};
		int[] arr2={5,1,2,7,4,5,6};
		int[] arr3=null;
		int[] arr4={2,3,1,0,2,5};
		int duplication[]=new int[1];
		int duplication1[]=new int[1];
		int duplication2[]=new int[1];
		int duplication3[]=new int[1];
		int duplication4[]=new int[1];
		Solution sol=new Solution();
		//包含重复数字
		System.out.println(sol.duplicate(arr,7,duplication));
		System.out.println(duplication[0]);
		// 不包含重复数字
		System.out.println(sol.duplicate(arr1,7,duplication1));
		System.out.println(duplication1[0]);
		// 输入数组包含0~n-1之外的元素
		System.out.println(sol.duplicate(arr2,7,duplication2));
		System.out.println(duplication2[0]);
		// 输入数组为空
		System.out.println(sol.duplicate(arr3,0,duplication3));
		System.out.println(duplication3[0]);
		// 输入长度与数组长度不匹配
		System.out.println(sol.duplicate(arr4,7,duplication4));
		System.out.println(duplication4[0]);
	}
}