package fatec.poo.model;

public class Retangulo {

    private double altura;
    private double base;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public double calcArea() {
        return (altura * base);
    }

    public double calcPerimetro() {
        return (2 * (altura + base));
    }
}
