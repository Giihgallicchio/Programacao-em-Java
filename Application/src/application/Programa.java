package application;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        // Instalar o Scanner
        Scanner sc = new Scanner (System.in);
        double xA, xB, xC, yA, yB, yC;
        System.out.println("Entre com as medidas do Triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Entre com as medidas do Triangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        
        // Calcular a área do Triangulo
        double p = (xA + xB + xC) /2.0;
        double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
        System.out.printf("%.4f%n",areaX);
        
        p =(yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
        System.out.printf("%.4f%n",areaY);
        
         if(areaX >= areaY){
             System.out.printf("A maior area e de X: %.4f%n",areaX);
         } else {
              System.out.printf("A maior area e de Y: %.4f%n",areaY);
         }
        
        

    }
    
}
