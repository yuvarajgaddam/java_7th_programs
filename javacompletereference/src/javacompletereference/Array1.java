package javacompletereference;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int two[][]=new int[4][5];
		
		int i,j,k=0;
		
		for(i=0;i<4;i++) {
			for(j=0;j<5;j++) {
				two[i][j]=k;
				k++;
			}
		}
		
		for(i=0;i<4;i++) {
			for(j=0;j<5;j++) {
				System.out.print(two[i][j] + " ");
			
			}
			System.out.println();
		}
		
	}

}
