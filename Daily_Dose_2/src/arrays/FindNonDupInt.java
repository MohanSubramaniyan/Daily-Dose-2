package arrays;

public class FindNonDupInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,3,4,5,2,3,5};
		int res=find(array);
		System.out.println("First NonDup : "+res);
	}
	public static int find(int[]array) {
		for(int i=0;i<array.length;i++) {
			int init=array[i];
			boolean is=true;
			for(int j=0;j<array.length;j++) {
				if(i!=j && array[i]==array[j]) {
					is=false;
					break;
				}
			} if(is)
				return init;
		} return -1;
	}

}
