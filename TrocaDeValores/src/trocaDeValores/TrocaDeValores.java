package trocaDeValores;


import java.util.Scanner;

public class TrocaDeValores {
	
	public static void main(String[] args) {
		
		String nome1;
		String nome2;
		String aux;
		Scanner LerTeclado = new Scanner(System.in);
		nome1 = " é o mestre do Universo";
		nome2 = "";
		System.out.println("Troca de valores entre variaveis ");
		System.out.print("Qual o seu nome?: ");
		nome2 = LerTeclado.nextLine();
		aux = nome2;
		nome2 = nome1;
		nome1 = aux;
		System.out.println(nome1 + nome2);
	}

}
