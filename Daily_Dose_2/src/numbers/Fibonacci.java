package numbers;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int a=0,b=1,next;
		System.out.print(a+", "+b);
		for(int i=2;i<=num;i++) {
			next=a+b;
			a=b;
			b=next;
			System.out.print(", "+next);
		}
	}

}
