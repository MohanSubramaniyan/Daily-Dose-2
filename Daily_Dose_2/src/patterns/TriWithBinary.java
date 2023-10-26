package patterns;

public class TriWithBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				int res=(i+j)%2==0?1:0;
				System.out.print(res+" ");
			}System.out.println();
		}
	}

}
