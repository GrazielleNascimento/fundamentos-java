package fatec.poo.model;


import fatec.poo.model.Retangulo;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Retangulo retangulo1 = new Retangulo();

        System.out.println("Informe a altura: ");
        double altura = input.nextDouble();
        
        System.out.println("Informe a base: ");
        double base = input.nextDouble();
        
        retangulo1.setAltura(altura);
        retangulo1.setBase(base);

        // retangulo1.setAltura(5.0);
        // retangulo1.setBase(8.0);;
        System.out.println("A base é: " + retangulo1.getAltura());
        System.out.println("A altura é: " + retangulo1.getAltura());
        System.out.println("Area: " + retangulo1.calcArea());
        System.out.println("Perímetro:  " + retangulo1.calcPerimetro());
    }

}
