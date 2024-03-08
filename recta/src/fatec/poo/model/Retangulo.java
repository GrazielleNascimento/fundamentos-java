
package fatec.poo.model;

public class Retangulo {
    
    private double altura;
    private double base;
    
    public void setAltura(double altura){
      this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }
    
    public double getBase(){
        return this.base = base;
    }
    public void setBase(double base){
      this.base =  base;
    }
    
    public double calcArea(){
        return base * altura;
    }
    public double calcPerimetro(){
        return (2 *(base + altura));
    }
    public double calcDiagonal(){
        return (Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2)));
    }
    
}
