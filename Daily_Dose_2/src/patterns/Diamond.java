package patterns;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		//upper part
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++ ) {
				System.out.print(" *");
			}System.out.println();
		}
		// lower part
		for(int i=row-1;i>0;i--) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++ ) {
				System.out.print(" *");
			}System.out.println();
		}
	}

}
