package matriz;

import java.util.Scanner;
public class  Exc2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
				System.out.println("JOGO DA VELHA");
				
			String jogo[][] = new String [3][3];
			String res= "x";
			int i,j,Linha,Coluna;
				
			//lendo 
				for(i=0;i<9;i++) {
						System.out.println("Digite a Linha:");
							int linha  = in.nextInt();
						System.out.println("Digite a Coluna:");
							int coluna  = in.nextInt();
						
						System.out.println("X ou O?");
							res = in.next();
								if(res.equalsIgnoreCase("X")) {
									jogo [linha][coluna] = "X";
								}else {
									jogo [linha][coluna] = "O";

								}
					}
				//apresentando
			for(i=0;i<3;i++) {
				System.out.println(" ");
				for(j=0;j<3;j++) {
					System.out.print(jogo[i][j]);

				}
			}
				
					//verificaçao
					if(jogo[2][0].equalsIgnoreCase("X")&& jogo[2][1].equalsIgnoreCase("X")&& jogo[2][2].equalsIgnoreCase("X") ||
					jogo[1][0].equalsIgnoreCase("X")&& jogo[1][1].equalsIgnoreCase("X")&& jogo[1][2].equalsIgnoreCase("X")
					|| jogo[0][0].equalsIgnoreCase("X")&& jogo[0][1].equalsIgnoreCase("X")&& jogo[0][2].equalsIgnoreCase("X")) {
						
						System.out.println(" O (X) ganhou");
						
					}else if(jogo[2][0].equalsIgnoreCase("O")&& jogo[2][1].equalsIgnoreCase("O")&& jogo[2][2].equalsIgnoreCase("O") ||
					jogo[1][0].equalsIgnoreCase("O")&& jogo[1][1].equalsIgnoreCase("O")&& jogo[1][2].equalsIgnoreCase("O")
					|| jogo[0][0].equalsIgnoreCase("O")&& jogo[0][1].equalsIgnoreCase("O")&& jogo[0][2].equalsIgnoreCase("O")){
						
						System.out.println(" A (O)ganhou");
						//Verificada da linha
					}else if (jogo[0][2].equalsIgnoreCase("X")&& jogo[1][2].equalsIgnoreCase("X")&& jogo[2][2].equalsIgnoreCase("X") ||
					jogo[0][1].equalsIgnoreCase("X")&& jogo[1][1].equalsIgnoreCase("X")&& jogo[2][1].equalsIgnoreCase("X")
					|| jogo[0][0].equalsIgnoreCase("X")&& jogo[1][0].equalsIgnoreCase("X")&& jogo[2][0].equalsIgnoreCase("X")){
						
						System.out.println(" O (X) ganhou");

					}else if (jogo[0][2].equalsIgnoreCase("O")&& jogo[1][2].equalsIgnoreCase("O")&& jogo[2][2].equalsIgnoreCase("O") ||
							jogo[0][1].equalsIgnoreCase("O")&& jogo[1][1].equalsIgnoreCase("O")&& jogo[2][1].equalsIgnoreCase("O")
							|| jogo[0][0].equalsIgnoreCase("O")&& jogo[1][0].equalsIgnoreCase("O")&& jogo[2][0].equalsIgnoreCase("O")) {
						
						System.out.println(" A (O) ganhou");
						//Verificada da coluna
					}else if(jogo [0][0].equalsIgnoreCase("X") && jogo [1][1].equalsIgnoreCase("X") && jogo [2][2].equalsIgnoreCase("X") || 
							jogo [0][2].equalsIgnoreCase("X") && jogo [1][1].equalsIgnoreCase("X") && jogo [2][0].equalsIgnoreCase("X")) {
						
						System.out.println("O (X) ganhou");

					}else if(jogo [0][0].equalsIgnoreCase("O") && jogo [1][1].equalsIgnoreCase("O") && jogo [2][2].equalsIgnoreCase("O") || 
							jogo [0][2].equalsIgnoreCase("O") && jogo [1][1].equalsIgnoreCase("O") && jogo [2][0].equalsIgnoreCase("O")) {
					
						System.out.println(" A (O)ganhou");
						//verificaçao da vertical
					}else {
						System.out.println(" Deu velha");
					}
				
					

	}

}
