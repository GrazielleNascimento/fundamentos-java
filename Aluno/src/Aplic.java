
import fatec.poo.model.Aluno;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("\tAluno 1");
        System.out.print("P1: ");
        double p1Aluno1 = input.nextDouble();
        System.out.print("P2: ");
        double p2Aluno1 = input.nextDouble();
        System.out.print("T1: ");
        double t1Aluno1 = input.nextDouble();
        System.out.print("T2: ");
        double t2Aluno1 = input.nextDouble();

        Aluno objAluno1 = new Aluno(123, p1Aluno1, p2Aluno1, t1Aluno1, t2Aluno1);

        System.out.println("\tAluno 2");

        System.out.print("P1: ");
        double p1Aluno2 = input.nextDouble();
        System.out.print("P2: ");
        double p2Aluno2 = input.nextDouble();
        System.out.print("T1: ");
        double t1Aluno2 = input.nextDouble();
        System.out.print("T2: ");
        double t2Aluno2 = input.nextDouble();

        Aluno objAluno2 = new Aluno(543, p1Aluno2, p2Aluno2, t1Aluno1, t2Aluno2);
        int opcao;

        do {

            System.out.println("Bem vindo a Escola NOta mil");
            System.out.println("1- ALUNO 1");
            System.out.println("2- ALUNO 2");
            System.out.println("3- Sair");

            System.out.println("Escolha uma opcao: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Notas Aluno 1:");
                    System.out.println("RA: "+ objAluno1.getRa());
                    System.out.println("P1: " + objAluno1.getP1());
                    System.out.println("P2: " + objAluno1.getP2());
                    System.out.println("T1: " + objAluno1.getT1());
                    System.out.println("T2: " + objAluno1.getT2());
                    System.out.println("Media Prova: " + df.format(objAluno1.calcMediaProva()));
                    System.out.println("Media Trabalho: " + df.format(objAluno1.calcMediaTrab()));
                    System.out.println("Media Final: " + df.format(objAluno1.calcMediaFinal()));
                    break;

                case 2:
                    System.out.println("Notas Aluno 2:");
                    System.out.println("RA: " + objAluno2.getRa());
                    System.out.println("P1: " + objAluno2.getP1());
                    System.out.println("P2: " + objAluno2.getP2());
                    System.out.println("T1: " + objAluno2.getT1());
                    System.out.println("T2: " + objAluno2.getT2());
                    System.out.println("Media Prova: " + df.format(objAluno2.calcMediaProva()));
                    System.out.println("Media Trabalho: " + df.format(objAluno2.calcMediaTrab()));
                    System.out.println("Media Final: " + df.format(objAluno2.calcMediaFinal()));
                    break;
                    
                case 3:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opcao invalida. Digite novamente...");
                    break;
            }
                

        } while (opcao != 3);

    }

}
