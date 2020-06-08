
public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro  = 10; // variaveis guardam valores e nao referencias 
		
		System.out.println(segundo);
	}
}
