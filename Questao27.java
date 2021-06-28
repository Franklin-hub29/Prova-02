package Revisao;
import java.util.Scanner;

public class Questao27 {
	
	public static void main(String[]args) {
		
		int [] numero = new int [50];
		
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		
		for(int i = 0; i <4 ; i++) {
		System.out.println("Digite um número");
		 numero[i] = entrada.nextInt();
		if(numero[i] % 3 == 0) {
			soma += numero[i];
		}
			
			}
		
		
		
		System.out.print("Valor da soma dos multiplos de 3---- são"+"-"+soma);
		
		
				
	
		entrada.close();
		
		
		
		
		
		
	


               

	}
}