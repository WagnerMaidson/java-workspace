
public class TesteCondicional2parte2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadedePessoas = 3;
		boolean acompanhado = quantidadedePessoas >= 2;
		
		System.out.println("Valor de acomnhado =" + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("Infelizmente voce nao pode entrar");
			}
		}
}

