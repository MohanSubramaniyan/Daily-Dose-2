package patterns;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=6;
		//upper part
		for(int i=1;i<=row;i++) {
			for(int j=row-i;j>0;j--) {
				System.out.print(" ");
			}for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}System.out.println();
		}
	}

}
