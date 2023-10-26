package patterns;

public class XPattern {

	public static void main(String[] args) {
		int size = 7; // You can change the size of the 'X'

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (i == j || i + j == size + 1) {
					System.out.print(i+" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
