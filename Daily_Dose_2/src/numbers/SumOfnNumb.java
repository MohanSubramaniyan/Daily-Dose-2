package numbers;
import java.util.*;
public class SumOfnNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		sc.close();
		for(int i=1;i<=num;i++) {
			sum+=i;
		}System.out.println(sum);
	}

}
