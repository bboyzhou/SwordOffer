// ��Ŀ��: ���޸������ҳ��ظ�������
// ��������������Ϊn+1���������������ֶ���1~n,
// �ҳ�����һ���ظ����֣������޸���������

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
			// ������numbers������[start,middle]֮�����ֵĸ���
			int count=countRange(numbers,length,start,middle);
			// �ж��Ƿ��ҵ��ظ���
			if(end==start){
				if(count>1){
					return start;
				}
				else{
					return -1;
				}
			}
			// ������ĸ����������䳤�ȣ����ظ���һ����[start middle]��
			if(count>middle-start+1){
				end=middle;
			}
			else{
				start=middle+1;
			}
		}
		// ����δ�����ظ���,����-1
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
		//�����ظ�����
		System.out.println(sol.getDuplication(arr,8));
		// �������ظ�����
		System.out.println(sol.getDuplication(arr1,8));
		// ��������Ϊ��
		System.out.println(sol.getDuplication(arr2,0));
	}
}