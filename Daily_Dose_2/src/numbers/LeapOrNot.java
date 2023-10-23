package numbers;
import java.util.*;
public class LeapOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner virat= new Scanner(System.in);
		int year=virat.nextInt();
		virat.close();
		String result=(year%400==0 || (year%4==0 && year%100!=0))?"leap":"not leap";
		System.out.println(result);
	}

}
