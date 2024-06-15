package main;

import implementation.Supermarket;
import implementation.SupermarketArray;
import java.util.Scanner;

public class Main {

    private final static int SIZE = 3;


    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Supermarket supermarket = new SupermarketArray(SIZE);
    int opcao;
    do {
        System.out.println("\nLista de Compras ");
        System.out.println("1 - inserir ");
        System.out.println("2 - listar ");
        System.out.println("3 - remover ");
        System.out.println("4 - Sair ");
        System.out.println(" ESCOLHA UMA OPÇÃO: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o item a ser inserido: ");
                String item = scanner.next();
                supermarket.add(item);
                break;
            case 2:
                supermarket.print();
                break;
            case 3:
                System.out.println("Digite a posição do item a ser removido: ");
                int index = scanner.nextInt();
                supermarket.delete(index);
                break;
            case 4:
                System.out.println("saindo do programa...");
                break;
            default:
                System.out.println("Opção invalida, por favor, escolha novamente");
        }
    }while (opcao != 4);
    scanner.close();
    }
}
