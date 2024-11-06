package SCR;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	ArrayList<String> frutas = new ArrayList<>();
    	
    	while (true) {
    		try {
    			System.out.println("\nEscolha uma opção");
    			System.out.println("1. Adicionar uma fruta");
    			System.out.println("2. Listar todas as frutas");
    			System.out.println("3. Modificar uma fruta");
    			System.out.println("4. Remover uma fruta");
    			System.out.println("5. Sair");
    			System.out.println("\nOpção: ");
    			
    			int opcao = scanner.nextInt();
    			scanner.nextLine(); //Limpa o Buffer
    			
    			switch (opcao) {
    			case 1:
        			System.out.print("Digite o nome da fruta para adicionar: ");
        			String novaFruta = scanner.nextLine();
        			frutas.add(novaFruta);
        			System.out.println(novaFruta + " foi adicionada.");
        			break;
    			case 2:
        			System.out.print("Frutas: " + frutas);
        			break;
    			case 3:
        			System.out.print("Digite o índice da fruta que deseja modificar: ");
        			int indiceModificar = scanner.nextInt();
        			scanner.nextLine(); //limpa o buffer
        			if(indiceModificar >= 0 && indiceModificar < frutas.size()) {
            			System.out.print("Digite o novo nome da fruta: ");
            			String frutaModificada = scanner.nextLine();
            			frutas.set(indiceModificar, frutaModificada);
        				System.out.print("Fruta no índice " + indiceModificar + " foi modificada  para " + frutaModificada);
        			}else {
            			System.out.print("Índice inválido");
        			}
        			break;
    			case 4:
        			System.out.print("Digite o nome da fruta que deseja remover: ");
        			String frutaRemover = scanner.nextLine();
        			if(frutas.remove(frutaRemover)) {
            			System.out.print(frutaRemover + " foi removida");
        			} else {
            			System.out.print(frutaRemover + " não foi encontrada.");
        			}
        			break;
    			case 5:
        			System.out.print("Saindo...");
        			scanner.close();
        			return;
        			default:
            			System.out.print(" Opção inválida. Tente Novamente.");
            		}
    		} catch (InputMismatchException e) {
    			System.out.print("Entrada invália. Por favor, digite um número.");
    			scanner.nextLine();
    			}


    	
    	}
    	}
}
