package matriz;

import java.util.Scanner;

public class Exc3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		final int LINHA = 5;
		final int COLUNA = 5;
		
		int A[][],i,j,B[],v;
		A = new int [LINHA][COLUNA];
		B = new int [COLUNA];
		
		for(i=0;i<LINHA;i++) {
			for(j=0;j<COLUNA;j++) {
				System.out.println("Digite o numero da Coluna "+j+" da Linha "+i);
				A[i][j] = in.nextInt();
		
			}
			 
		}

		for(i=0;i<LINHA;i++) {
			System.out.println(" ");
			for(j=0;j<COLUNA;j++) {
				System.out.print(A[i][j]+" ");
			
				if(i==j ) {
					v=i;
					B[v] = A[i][j];
				 }
			}
			
		}
		System.out.println(" ");
		
		System.out.print("A diagonal principal e: [ ");
		for(v=0;v<COLUNA;v++) {
			
			System.out.print(B[v]+" ");
			
		}		System.out.print(" ]");

	}

}
