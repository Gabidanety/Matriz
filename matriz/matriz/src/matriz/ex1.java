package matriz;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int LINHA = 4;
		final int COLUNA = 2;
		
		int j,i,a[][],soma=0;
		a = new int [LINHA][COLUNA];
		
		for(i=0;i<LINHA;i++) {//linhas

			for(j=0;j<COLUNA;j++) {//colunas
				
				System.out.println("Digite o numero da Coluna "+j+" da Linha "+i);
				a[i][j] = in.nextInt();
			}

		}
		
		for(i=0;i<LINHA;i++) {
			soma =0;

			System.out.println(" ");
			for(j=0;j<COLUNA;j++) {
				soma = a[i][j]+soma;
				
					if(j>0) {
						System.out.print("+"+a[i][j]);
					}else {
						System.out.print(a[i][j]);
					}
				
				}
					System.out.print(" = "+soma);
			}
		

		
				
			
	}

}
