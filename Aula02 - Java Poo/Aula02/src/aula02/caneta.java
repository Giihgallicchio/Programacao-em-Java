
package aula02;

public class caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada? " + this.tampada);

        //System.out.println("A caneta eh: " + this.cor + "\nA caneta tem ponta: " + this.ponta + "\nA carga esta: " + this.carga + "\nEsta Tampada: " + this.tampada);
        
    }
    void rabiscar() {
        if  (this.tampada == true){
            System.out.println("ERRO!!! Nao posso Rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
    }
        
    }
    void tampar() {
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }
    
}
