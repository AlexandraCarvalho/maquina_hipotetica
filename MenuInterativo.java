import java.util.Scanner;


public class MenuInterativo {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// String para exibir as intru��es digitas
		String exibe = "";
		// string para testar se a intru��o � a instru��o de parada
		String testa = "";
		
		
		
		
		
		System.out.println("digite a intru��o");
		
		// loop de repeti��o que s� paraqundo o usu�rio digitar C000
		while(true)
		{
			
			testa= entrada.next() ;
			
			exibe += testa + "\n";
			
			// exibe as instru��es que ja foram digitadas
			System.out.println(exibe.toUpperCase());
			
			
			// testa se a intru��o � C000
		if(testa.toUpperCase().equals("C000")){
				System.out.println("condi��o de parada digitada");
				break;
				
			}
		}
		
		

	}

}

