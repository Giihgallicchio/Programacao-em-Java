package areacasa2;

public class AreaCasa2 {
    
    final static double valorM2 = 1500;
    
    static double valorCasa(double paramArea){
        if (paramArea >= 0){
            return(valorM2*paramArea);
        } else{
            return -1;
        }
        
        
    }

    public static void main(String[] args) {
        double preco;
        boolean valorOK = false;
        
        preco = valorCasa(20);
        
        if(preco >= 0) valorOK = true;
        else valorOK = false;
        
        if (valorOK) System.out.println("O Valor da construção é: " + preco);
        else System.out.println("Você entrou um valor de area negativo. Volta para escolinha!");
        
        

    }
    
}
