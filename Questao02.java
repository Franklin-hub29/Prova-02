package Prova02;
import java.util.Scanner;

public class Questao02 {
	
	public static void main(String[]args) {
		for(int i = 2; i < 1 ; i++) {
			
			System.out.println(" Digite 01 para receita");
			System.out.println(" Digite 02 ára Despesa");
			System.out.println("Digite 0 para sair");
			
		}
		
			float receita=0;
			float despesa=0;
		
		
		//System.out.println(" Digite 01 para receita");
		//System.out.println(" Digite 02 ára Despesa");
		//System.out.println("Digite 0 para sair");
		
		Scanner entrada = new Scanner(System.in);
		if(entrada.nextFloat() == 1) {
			 receita = entrada.nextFloat();
		}else if (entrada.nextFloat() == 2) {
			 despesa = entrada.nextFloat();
		}else if(entrada.nextFloat() == 0) {
			System.exit(0);
			
		}
		float resultado = receita - despesa;
		
		System.out.println("Saldo " +resultado);
		
		
		}
		
		
		
		
	}
			
		
	


