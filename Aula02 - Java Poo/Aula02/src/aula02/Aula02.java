
package aula02;

public class Aula02 {

    public static void main(String[] args) {
        System.out.println("\nCaneta 01 \n");
        
        caneta c1 =  new caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        //c1.carga = 90;
        c1.tampar();
        
        c1.status();
        c1.rabiscar();
        
        System.out.println("\nCaneta 02 \n");
        
        caneta c2 = new caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
    
}
