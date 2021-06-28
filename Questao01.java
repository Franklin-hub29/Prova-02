package Prova02;
import java.util.Scanner;

public class Questao01 {
	
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float [] peso = new float[100];
		float [] altura = new float[100];
	//	float [] imc = new float [100];
		
		for(int i = 0; i < 100 ; i++) {
		System.out.println("Informe seu peso");		
		peso[i] = entrada.nextFloat();
		System.out.println("Informe sua altura");
		altura[i] = entrada.nextFloat(); 
		
		float [] imc = new float [100];
		
		  imc  = peso[i]  / (altura[i] *altura[i]);
		
		
		
		float 
		
	}
	

}
