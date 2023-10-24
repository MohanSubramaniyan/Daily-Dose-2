package numbers;
import java.util.*;
public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int temp=n,rev=0,rem;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		String res=rev==n?"Palindrome":"No bro";
		System.out.println(res);
	}

}
