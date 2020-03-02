import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valorTotal = 45;
		int valorInicial = 0;
		Scanner valInput = new Scanner(System.in);
		
		do {
			
			System.out.println("Insira o valor da moeda: ");
			String moeda = valInput.nextLine();
			int valorMoeda = Integer.parseInt(moeda);
			
			if ( valorMoeda == 25  ||  valorMoeda == 10 ){
				valorInicial+=valorMoeda;
					
					if (valorInicial >= valorTotal) {
						System.out.println("Aqui esta sua coca!");					
					}
			}
			
			else {
				System.out.println("Erro! Tipo de moeda não aceito.");
			}
				
		}while(valorInicial < valorTotal);		
	}
}
