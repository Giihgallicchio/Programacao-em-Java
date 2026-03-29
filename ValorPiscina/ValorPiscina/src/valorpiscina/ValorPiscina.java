
package valorpiscina;

public class ValorPiscina {

    static final int ALVENARIA = 0;
    static final int VINIL = 1;
    static final int FIBRA = 2;
    static final int PLASTICO = 3;
    
    public static void main(String[] args) {
        double area;
        int material;
        double valor;
        
        area = 20;
        material = 45;
        
        switch (material) {
            case ALVENARIA: valor = 1500; System.out.println(" - Alvenaria!"); break;
            case VINIL: valor = 1100; System.out.println(" - Vinil!"); break;
            case FIBRA: valor = 750; System.out.println(" - Fibra!"); break;
            case PLASTICO: valor = 500; System.out.println(" - Plastico!"); break;
            default: valor = -1; System.out.println(" - Errado!");
        }
        
        if (valor >= 0 ){
             System.out.println("O custo da piscina eh " + (area*valor));
        } else {
             System.out.println("Nao entrou o valor correto " + (area*valor));
        }
        
        
        
     
    }
    
}
