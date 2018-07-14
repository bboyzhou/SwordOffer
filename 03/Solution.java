public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
	//    ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication){
		//������
		if(numbers==null || length<=0 || length!=numbers.length){
			return false;
		}
		for(int i=0;i<length;i++){
			if(numbers[i]<0 || numbers[i]>=length){
				return false;
			}
		}

		// ��������
		for(int i=0;i<length;i++){
			//�жϵ�ǰλ���±��Ƿ��뵱ǰֵ���
			while(numbers[i]!=i){
				//�������,��Ƚ�numbers[numbers[i]]��numbers
				if(numbers[i]==numbers[numbers[i]]){
					// ����ȣ����ҵ��ظ�����
					duplication[0]=numbers[i];
					return true;
				}
				else{
					// �����ȣ��򽻻�������Ԫ��λ�ã���numbers[i]���ں���λ��
					int temp=numbers[i];
					numbers[i]=numbers[temp];
					numbers[temp]=temp;
				}
			}
		}
		// ��û�ҵ��ظ�Ԫ�� ������false
		return false;
    }
	// ����
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
		//�����ظ�����
		System.out.println(sol.duplicate(arr,7,duplication));
		System.out.println(duplication[0]);
		// �������ظ�����
		System.out.println(sol.duplicate(arr1,7,duplication1));
		System.out.println(duplication1[0]);
		// �����������0~n-1֮���Ԫ��
		System.out.println(sol.duplicate(arr2,7,duplication2));
		System.out.println(duplication2[0]);
		// ��������Ϊ��
		System.out.println(sol.duplicate(arr3,0,duplication3));
		System.out.println(duplication3[0]);
		// ���볤�������鳤�Ȳ�ƥ��
		System.out.println(sol.duplicate(arr4,7,duplication4));
		System.out.println(duplication4[0]);
	}
}