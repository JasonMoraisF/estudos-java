package UNIT.FichasPOO.AldoProfAtividades.Atividade3.src;


import UNIT.FichasPOO.AldoProfAtividades.Atividade3.util.Elevador;

public class Program {
	static Elevador elevadores[] = new Elevador[4];

	public static void main(String[] args) {
		
		
		elevadores[0] = new Elevador(2);
		elevadores[3] = new Elevador(5);
		mostraElevadores();
		
		elevadores[0]=null;	
		mostraElevadores();
		
		elevadores[0] = new Elevador(55);	
		mostraElevadores();
		
		elevadores[1] = new Elevador(123);
		mostraElevadores();

	}
	

	public static void mostraElevadores() {
		for (int i = 0; i < elevadores.length; i++) {
			if (elevadores[i] != null) {
				System.out.printf("\nElemento: %d", i);
				System.out.printf("\nCódigo...............: %d\n", elevadores[i].getCodigo());
				System.out.printf("Limite de pessoas....: %d\n", elevadores[i].getLimitePessoas());
				System.out.printf("Pessoas transportadas: %d\n", elevadores[i].getPessoasTransportadas());
				System.out.printf("Situação.............: %s\n", elevadores[i].getStatus());				
			}
			else {
				System.out.printf("\nElemento %d: nulo", i);
			}
		}
		
	}

}
