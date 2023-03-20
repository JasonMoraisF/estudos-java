package UNIT.FichasPOO.AldoProfAtividades.DiabeteAtividade.src;

import javax.tools.Diagnostic;
import java.util.Scanner;
import UNIT.FichasPOO.AldoProfAtividades.DiabeteAtividade.util.Exame;


public class Program {

    static Scanner sc = new Scanner(System.in);
    static Exame exames[] = new Exame[3];
    static int contExame = 0;
    
    public static void main(String[] args) {
        int opcao = 0;
        do{
            System.out.println("\n*** Seletor de Opções ***");
			System.out.println();
			System.out.println("1 - Cadastrar exame");
			System.out.println("2 - Consultar exame");
			System.out.println("3 - Alterar exame");
			System.out.println("4 - Excluir exame");
			System.out.println("5 - Listar exame");
			System.out.println("0 - Finalizar programa");

            System.out.println("Opção : ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                cadastraExame();
                break;

                case 2:
                consultaExame();
                break;

                case 3:
                alteraExame();
                break;

                case 4:
                excluiExame();
                break;

                case 5:
                listaExame();
                break;

                case 0:
                System.out.println("----PROGRAMA FINALIZADO----");
                break;
                
                default:
                System.out.println("Opção incorreta");
            }
        }while(opcao != 0);
            sc.close();
    }
    public static int pesquisaExamePorCodigo(int codigo) {
		for (int i = 0; i < exames.length; i++) {
			if (exames[i] != null && codigo == exames[i].getIdExame()) {
				return i;
            }  
        }
        return -1;
    }
    public static void cadastraExame() {
		System.out.println("\n*** Cadastro de Exame ***\n");
		
		if (contExame == exames.length) {
			System.out.println("Vetor cheio");
			return;
		}
		
		System.out.printf("\nCódigo do Exame: ");
		int codigo = sc.nextInt();
		
		if (pesquisaExamePorCodigo(codigo) != -1) {
			System.out.println("\n-- Código já cadastrado --\n");
			return;
		}	

		for (int i = 0; i < exames.length; i++) {
			if (exames[i] == null) {
				exames[i]= new Exame();
				contExame++;
				System.out.println("\n-- Cadastro efetuado --\n");
				return;
			}
		}
		System.out.println("Não tem mais posição vazia para cadastro");		
	}

    public static void consultaExame() {
		System.out.println("\n*** Consulta de Elevador ***\n");
		if (contExame ==0) {
			System.out.println("Vetor vazio");
			return;
		}
		
		System.out.printf("\nCódigo do elevador: ");
		int codigo = sc.nextInt();
		
		int posicaoEncontrada = pesquisaExamePorCodigo(codigo);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nId Exame...............: %d\n", exames[posicaoEncontrada].getIdExame());
		System.out.printf("Diagnostico.............: %s\n", exames[posicaoEncontrada].obterDiagnostico());				

	}

    public static void alteraExame() {
		System.out.println("\n*** Alteração de Elevador ***\n");
		if (contExame ==0) {
			System.out.println("Vetor vazio");
			return;
		}

		System.out.printf("\nCódigo do elevador: ");
		int codigo = sc.nextInt();
		
		int posicaoEncontrada = pesquisaExamePorCodigo(codigo);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nId Exame...............: %d\n", exames[posicaoEncontrada].getIdExame());
		System.out.printf("Diagnostico.............: %s\n", exames[posicaoEncontrada].obterDiagnostico());				

		System.out.println("\nNovo nome: ");
		String novoNome = sc.nextLine();
        sc.nextLine();
		exames[posicaoEncontrada].setNomePaciente(novoNome);
		System.out.println("Novo Nivel de Glicose: ");
        int novoNivelGlicose = sc.nextInt();
        exames[posicaoEncontrada].setNivelGlicose(novoNivelGlicose);
        System.out.println("Nome e niveis de Glicose Atualizados");
	}

    public static void excluiExame() {
		System.out.println("\n*** Exclusão de Exame ***\n");
		if (contExame ==0) {
			System.out.println("Vetor vazio");
			return;
		}
		
		System.out.printf("\nId do Exame: ");
		int codigo = sc.nextInt();
		
		int posicaoEncontrada = pesquisaExamePorCodigo(codigo);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nId do Exame...............: %d\n", exames[posicaoEncontrada].getIdExame());
		System.out.printf("Diagnostico.............: %s\n", exames[posicaoEncontrada].obterDiagnostico());				
		
		char confirma;
		do {
			System.out.printf("\nConfirma exclusão [S/N: ");
			sc.nextLine();
			confirma = sc.nextLine().charAt(0);
			confirma = Character.toUpperCase(confirma);
			if(confirma!='S' && confirma!='N') {
				continue;
			}
			break;
		} while (true);
		if (confirma=='S') {
			exames[posicaoEncontrada] = null;
			System.out.println("-- Exclusão efetuada");	
			contExame--;
		}
		else {
			System.out.println("-- Exclusão cancelada");
		}
    }

        public static void listaExame() {
            
            System.out.println("\n*** Listagem de Exame ***\n");
            if (contExame ==0) {
                System.out.println("Vetor vazio");
                return;
            }
            
            System.out.println("=====================================");
            System.out.println("Codigo Status      Capacidade Pessoas   ");
            System.out.println("=====================================");
    
            for (int i = 0; i < exames.length; i++) {
                if (exames[i] != null) {
                    System.out.printf("%-6d %11s %10d %7d\n", 
                                exames[i].getIdExame(),
                              exames[i].obterDiagnostico());				
                }
                else {
                    System.out.printf("%dº Elemento nulo\n", i);
                }
            }
            
            System.out.println("=====================================");
	    }
    }   


