package numbers;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=496,sum=0;
		for(int i=1;i<num;i++) {
			int res=num%i==0?sum+=i:0;
		} String po=sum==num?"perfect":"no bro";
		System.out.println(po);
	}

}
