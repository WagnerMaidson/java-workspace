package mediaAluno;

import java.util.Scanner;

public class MediaAluno {
	
	public static void main(String[] args) {
		
		String nome = "";
		float n1 = 0;
		float n2 = 0;
		float n3 = 0;
		float n4 = 0;
		double total = 0;
		double media = 0;
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.println("Calcula a media de matematica");
		System.out.println("");
		System.out.print("Qual e o seu nome:");
		nome = LerTeclado.nextLine();
		
		System.out.print("Informe a primeira nota:");
		n1 = LerTeclado.nextFloat();
		
		System.out.print("Infome a segunda nota:");
		n2 = LerTeclado.nextFloat();
		
		System.out.print("Informe a terceira nota:");
		n3 = LerTeclado.nextFloat();
		
		System.out.print("infome a quarta nota:");
		n4 = LerTeclado.nextFloat();
		
		total = n1 + n2 + n3 + n4;
		media = total/4;
		System.out.println(nome + " a sua media e " + media);
		
		
	}
	
	
}
