package helloWorld;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		String nome;
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.println("Porgrama de boas vindas!!!");
		System.out.print("Qual é seu nome?: ");
		nome  = LerTeclado.nextLine();
		System.out.println("Olá " + nome);
	}

}
