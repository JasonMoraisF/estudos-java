package UNIT.FichasPOO.CodigoFonteElevador.src;

import java.awt.Point;
import java.util.Scanner;

import UNIT.FichasPOO.CodigoFonteElevador.util.Elevador;


public class ProgramaElavadorArray {

	
	static Elevador elevadores[] = new Elevador[5];
	static Scanner input = new Scanner(System.in);		
	static int contElevador=0;
	
	public static void main(String[] args) {


		int opcao = 0;
		do {
			System.out.println("\n*** Seletor de Opções ***");
			System.out.println();
			System.out.println("1 - Cadastrar Elevador");
			System.out.println("2 - Consultar Elevador");
			System.out.println("3 - Alterar Elevador");
			System.out.println("4 - Excluir Elevador");
			System.out.println("5 - Listar Elevadores");
			System.out.println("0 - Finalizar");

			System.out.print("\nOpção: ");
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				cadastraElevador();
				break;
			case 2:
				consultaElevador();
				break;
			case 3:
				alteraElevador();
				break;
			case 4:
				excluiElevador();
				break;
			case 5:
				listaElevadores();
				break;
			case 0:
				System.out.println("\n--- PROGRAMA FINALIZADO");
				break;
			default:
				System.out.println("\nOpção incorreta");
				
			}
			
		} while (opcao !=0);
		input.close();
	}
	
	public static int pesquisaElevadorPorCodigo(int codigo) {
		for (int i = 0; i < elevadores.length; i++) {
			if (elevadores[i] != null && codigo == elevadores[i].getCodigo()) {
				return i;
			}
		}
		return -1;
	}
	
	public static void cadastraElevador() {
		System.out.println("\n*** Cadastro de Elevador ***\n");
		
		if (contElevador == elevadores.length) {
			System.out.println("Vetor cheio");
			return;
		}
		
		System.out.printf("\nCódigo do elevador: ");
		int codigo = input.nextInt();
		
		if (pesquisaElevadorPorCodigo(codigo) != -1) {
			System.out.println("\n-- Código já cadastrado --\n");
			return;
		}	

		for (int i = 0; i < elevadores.length; i++) {
			if (elevadores[i] == null) {
				elevadores[i]= new Elevador(codigo);
				contElevador++;
				System.out.println("\n-- Cadastro efetuado --\n");
				return;
			}
		}
		System.out.println("Não tem mais posição vazia para cadastro");		
	}

	public static void consultaElevador() {
		System.out.println("\n*** Consulta de Elevador ***\n");
		if (contElevador ==0) {
			System.out.println("Vetor vazio");
			return;
		}
		
		System.out.printf("\nCódigo do elevador: ");
		int codigo = input.nextInt();
		
		int posicaoEncontrada = pesquisaElevadorPorCodigo(codigo);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nCódigo...............: %d\n", elevadores[posicaoEncontrada].getCodigo());
		System.out.printf("Limite de pessoas....: %d\n", elevadores[posicaoEncontrada].getLimitePessoas());
		System.out.printf("Pessoas transportadas: %d\n", elevadores[posicaoEncontrada].getPessoasTransportadas());
		System.out.printf("Situação.............: %s\n", elevadores[posicaoEncontrada].getStatus());				

	}
	
	public static void alteraElevador() {
		System.out.println("\n*** Alteração de Elevador ***\n");
		if (contElevador ==0) {
			System.out.println("Vetor vazio");
			return;
		}

		System.out.printf("\nCódigo do elevador: ");
		int codigo = input.nextInt();
		
		int posicaoEncontrada = pesquisaElevadorPorCodigo(codigo);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nCódigo...............: %d\n", elevadores[posicaoEncontrada].getCodigo());
		System.out.printf("Limite de pessoas....: %d\n", elevadores[posicaoEncontrada].getLimitePessoas());
		System.out.printf("Pessoas transportadas: %d\n", elevadores[posicaoEncontrada].getPessoasTransportadas());
		System.out.printf("Situação.............: %s\n", elevadores[posicaoEncontrada].getStatus());				

		System.out.println("\nNovo limite: ");
		int novoLimite = input.nextInt();
		elevadores[posicaoEncontrada].setLimite(novoLimite);
		System.out.println("Limite de pessoas no elavador alterado");
	}
	
	public static void excluiElevador() {
		System.out.println("\n*** Exclusão de Elevador ***\n");
		if (contElevador ==0) {
			System.out.println("Vetor vazio");
			return;
		}
		
		System.out.printf("\nCódigo do elevador: ");
		int codigo = input.nextInt();
		
		int posicaoEncontrada = pesquisaElevadorPorCodigo(codigo);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nCódigo...............: %d\n", elevadores[posicaoEncontrada].getCodigo());
		System.out.printf("Limite de pessoas....: %d\n", elevadores[posicaoEncontrada].getLimitePessoas());
		System.out.printf("Pessoas transportadas: %d\n", elevadores[posicaoEncontrada].getPessoasTransportadas());
		System.out.printf("Situação.............: %s\n", elevadores[posicaoEncontrada].getStatus());				
		
		char confirma;
		do {
			System.out.printf("\nConfirma exclusão [S/N: ");
			input.nextLine();
			confirma = input.nextLine().charAt(0);
			confirma = Character.toUpperCase(confirma);
			if(confirma!='S' && confirma!='N') {
				continue;
			}
			break;
		} while (true);
		if (confirma=='S') {
			elevadores[posicaoEncontrada] = null;
			System.out.println("-- Exclusão efetuada");	
			contElevador--;
		}
		else {
			System.out.println("-- Exclusão cancelada");
		}
		
		
	}
	
	public static void listaElevadores() {
		System.out.println("\n*** Listagem de Elevador ***\n");
		
		if (contElevador ==0) {
			System.out.println("Vetor vazio");
			return;
		}
		
		System.out.println("=====================================");
		System.out.println("Codigo Status      Capacidade Pessoas   ");
		System.out.println("=====================================");

		for (int i = 0; i < elevadores.length; i++) {
			if (elevadores[i] != null) {
				System.out.printf("%-6d %11s %10d %7d\n", 
				  		  elevadores[i].getCodigo(),
						  elevadores[i].getStatus(),
						  elevadores[i].getLimitePessoas(),
						  elevadores[i].getPessoasTransportadas());				
			}
			else {
				//System.out.printf("%dº Elemento nulo\n", i);
			}
		}
		
		System.out.println("=====================================");
		
		
	}
}
