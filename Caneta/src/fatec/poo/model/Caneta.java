package fatec.poo.model;

/**
 *
 * @author blossom
 */
public class Caneta {

    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String modelo, float ponta, String cor, boolean tampada) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;

    }
    public float getPonta(){
        return ponta;
    }
    public void setPonta(float ponta){
        this.ponta = ponta;
    }
    public boolean isTampada(){
        return tampada;
    }
    public void setTampada(boolean tampada){
        this.tampada = tampada;
    }
    public void status() {
        System.out.println("Sobre a Caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta() );
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}