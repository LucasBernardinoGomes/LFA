import java.util.Scanner;


public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean controle = true;
		double valorTotal = 0.45;
		double valorInicial = 0;
		Scanner valInput = new Scanner(System.in);
		
		
		do {
			
			System.out.println("Insira o valor da moeda: ");
			String moeda  = valInput. nextLine();

			double valorMoeda = Double.parseDouble(moeda);
			
			if ( valorMoeda == 0.25  ||  valorMoeda == 0.10 ){
					valorInicial+=valorMoeda;
					
					if (valorInicial >= valorTotal) {
							System.out.println("Aqui esta sua coca!");
							controle=false;							
					}
			}
			
			
			else {
				System.out.println("Erro! Tipo de moeda não aceito.");
			}
					
				
		}while(controle);
			
	}

}
