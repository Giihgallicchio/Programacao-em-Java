
package aula03;

import aula03.caneta;

public class Aula03 {

    public static void main(String[] args) {
        caneta c1 =  new caneta();
        c1.modelo = "Bic Crystal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = false;
        c1.status();
        c1.rabiscar();


    }
    
}
