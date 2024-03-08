
import fatec.poo.model.Carro;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Carro 1\n");
        
        System.out.print("Nome: ");
        String nome1 = input.next();
        
        System.out.print("Modelo: ");
        String modelo1 = input.next();

        System.out.print("Ano: ");
        int ano1 = input.nextInt();

        Carro objCarro1 = new Carro(nome1, modelo1, ano1);

        System.out.println("\nCarro 2");
        System.out.print("Nome: ");
        String nome2 = input.next();

        System.out.print("Modelo: ");
        String modelo2 = input.next();

        System.out.print("Ano: ");
        int ano2 = input.nextInt();

        Carro objCarro2 = new Carro(nome1, modelo1, ano2);

        int opcao;

        do {
            System.out.println("\nBem vindo a automotiva Solutions!!");
            System.out.println("1- Objeto Carro 1");
            System.out.println("2- Objeto Carro 2");
            System.out.println("3- sair");
            System.out.print("\nInforme a sua opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Nome:  " + objCarro1.getNome());
                    System.out.println("Modelo: " + objCarro1.getModelo());
                    System.out.println("Ano: " + objCarro1.getAno());
                    break;
                case 2:
                    System.out.println("Nome: " + objCarro2.getNome());
                    System.out.println("Modelo " + objCarro2.getModelo());
                    System.out.println("Ano: " + objCarro2.getAno());
                    break;
                    
                case 3:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção Invalida, digite novamente...");
                    break;
            }

        } while (opcao != 3);

    }

}
