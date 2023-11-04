package Two_D_Array;

public class MatrixExample {

	public static void main(String[] args) {
		int a [] [] = {
				{1,2, 3},
				{4,5,6},
				{7,8,9},
				};
		
		int col= a[0].length;
		int row= a.length;
		for(int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				System.out.print(a [i] [j]+ " ");
			}
			System.out.println();
		}

	}

}
