package Prova02;
import java.util.Scanner;

public class Questao03 {
	
	public static void main(String[]args) {
		 
		Scanner entrada = new Scanner(System.in);
		int recuperaao = 0;
		int i = 0;
		int [] alunos = new int [50];
		for( i = 0; i < 50 ; i++) {
		System.out.println("Informe a nota do aluno");
		 alunos = new int [50];
		alunos[i] = entrada.nextInt();
	
		}
		
		int contador = 0;
		 if(alunos[i] > 60 ) {
			 System.out.println("Passou Direto");
		 }else if(alunos [i] >=30 && alunos[i] <= 60) {
			 System.out.println("Recuperação");
		 }else if(alunos[i] < 30) {
			 System.out.println("Dependenia");
		 }
			 
		 
		 
			 
		 }

}
