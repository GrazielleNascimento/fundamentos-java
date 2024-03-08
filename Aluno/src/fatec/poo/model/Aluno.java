package fatec.poo.model;

public class Aluno {

    private int ra;
    private double p1;
    private double p2;
    private double t1;
    private double t2;

    public Aluno(int ra, double p1, double p2, double t1, double t2) {
        this.ra = ra;
        this.p1 = p1;
        this.p2 = p2;
        this.t1 = t1;
        this.t2 = t2;

    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public void setT1(double t1) {
        this.t1 = t1;
    }

    public void setT2(double t2) {
        this.t2 = t2;
    }

    public int getRa() {
        return ra;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public double getT1() {
        return t1;
    }

    public double getT2() {
        return t2;
    }    
    

    public double calcMediaProva() {
        return (0.75 *(p1 + p2) / 2);
    }
    
    public double calcMediaTrab(){
        return (0.25 *(t1 + t2) /2);
    }
    
    public double calcMediaFinal(){
        return calcMediaProva() + calcMediaTrab();
    }

}
