package matriz;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int A[][] = new int [3][3],i,j;
			
		for (i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					System.out.println("Digite o "+(i+1)+"numero da coluna e "+(j+1)+" numero da linha");
						A[i][j] = in.nextInt();
				}
			}
		
		for(i=0;i<3;i++) {
				System.out.println(" ");
				for(j=0;j<3;j++) {
					System.out.print(A[i][j]);

				}
			}

	}

}
