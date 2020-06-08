
public class VectorTeste {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Jose");
		
		
		Vector lista = new Vector();
		
		System.out.println(lista.tamanho());	
		lista.adiciona(a1);
		System.out.println(lista.tamanho());
		lista.adiciona(a2);
		System.out.println(lista.tamanho());
		
		System.out.println(lista);
		
		System.out.println(lista.contem(a1));
		
		
		Aluno a3 = new Aluno("Danilo");
		System.out.println(lista.contem(a3));
		
		lista.remove(1);
		System.out.println(lista);
		
		for(int i = 0; i < 300; i++) {
			Aluno y = new Aluno("Joao " + i);
			lista.adiciona(y);
		}
		
		System.out.println(lista);
	}

}
