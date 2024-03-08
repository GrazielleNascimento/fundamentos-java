
import fatec.poo.model.Retangulo;


public class Aplic {


    public static void main(String[] args) {
        
        
        Retangulo objRetangulo1 = new Retangulo();
        Retangulo objRetangulo2 = new Retangulo();
        Retangulo objRetangulo3 = new Retangulo();
        
        objRetangulo1.setAltura(5);
        objRetangulo1.setBase(8);
        
        objRetangulo2.setAltura(3);
        objRetangulo2.setBase(4);
        
        objRetangulo3.setAltura(5);
        objRetangulo3.setBase(4);
      
        System.out.println("\nObjeto Retangulo 1");
        
        System.out.println("Altura: " + objRetangulo1.getAltura());
        System.out.println("Base: " + objRetangulo1.getBase());
        System.out.println("Area: " + objRetangulo1.calcArea());
        System.out.println("Perimetro: "+ objRetangulo1.calcPerimetro());
        System.out.println("Diagonal: " + objRetangulo1.calcDiagonal());
        
              
        System.out.println("\nObjeto Retangulo 2");
        
        System.out.println("Altura: " + objRetangulo2.getAltura());
        System.out.println("Base: " + objRetangulo2.getBase());
        System.out.println("Area: " + objRetangulo2.calcArea());
        System.out.println("Perimetro: "+ objRetangulo2.calcPerimetro());
        System.out.println("Diagonal: " + objRetangulo2.calcDiagonal());
        
              
        System.out.println("\nObjeto Retangulo 3");
        
        System.out.println("Altura: " + objRetangulo3.getAltura());
        System.out.println("Base: " + objRetangulo3.getBase());
        System.out.println("Area: " + objRetangulo3.calcArea());
        System.out.println("Perimetro: "+ objRetangulo3.calcPerimetro());
        System.out.println("Diagonal: " + objRetangulo3.calcDiagonal());
        
        
        
        
        
    }
    
}
