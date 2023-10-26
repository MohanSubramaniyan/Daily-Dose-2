package numbers;

public class NumFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 98778990;
		String res = resfncn(input);
		System.out.println(res);
	}

	static String resfncn(int num) {
		StringBuilder result=new StringBuilder();
		String numstr= Integer.toString(num);
		int count=0;
		
		for(int i=numstr.length()-1;i>=0;i--) {
			result.insert(0,numstr.charAt(i));
			count++;
			if(count==3&&i!=0) {
				result.insert(0,'*');
				count=0;
			}
		}
		return result.toString();
	}
}
