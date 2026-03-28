
package aula03;

public class caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada? " + this.tampada);

        //System.out.println("A caneta eh: " + this.cor + "\nA caneta tem ponta: " + this.ponta + "\nA carga esta: " + this.carga + "\nEsta Tampada: " + this.tampada);
        
    }
    public void rabiscar() {
        if  (this.tampada == true){
            System.out.println("ERRO!!! Nao posso Rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
    }
        
    }
    protected void tampar() {
        this.tampada = true;
    }
    protected void destampar() {
        this.tampada = false;
    }
    
}
