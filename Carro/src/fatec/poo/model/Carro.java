
package fatec.poo.model;

public class Carro {
    private String nome;
    private String modelo;
    private int ano;
    
    public Carro(String nome, String modelo, int ano){
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setIdade(int ano){
        this.ano = ano;
    }
    public String getNome(){
        return nome;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
    
}
