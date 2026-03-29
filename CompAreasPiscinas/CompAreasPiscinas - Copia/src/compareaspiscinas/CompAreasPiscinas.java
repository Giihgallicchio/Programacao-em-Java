
package compareaspiscinas;

public class CompAreasPiscinas {
    
    static final int ALVENARIA = 0;
    static final int VINIL = 1;
    static final int FIBRA = 2;
    static final int PLASTICO = 3;
    
    //subrotina valorPiscina() ================================
    
    static double valorPiscina(double paramArea, int paramMaterial){
        double valorM2;
        
        switch(paramMaterial){
            case ALVENARIA: valorM2 = 1500; break;
            case VINIL: valorM2 = 1100; break;
            case FIBRA: valorM2 = 750; break;
            case PLASTICO: valorM2 = 500; break;
            default: valorM2 = -1;
            
        }
        return(paramArea * valorM2);
    }
    public static void main(String[] args) {
        
//        double areaPiscina = 50; //(M2) contador 
//        int tipo; // tipo de material: 0=ALVENARIA, 1=VINIL, 2= FIBRA, 3= PLASTICO
        
        System.out.println("Area\t\tMaterial\t\tValor");
        
        for (double areaPiscina = 50; areaPiscina <=200; areaPiscina = areaPiscina + 50){
            for(int tipo = 0; tipo <= 3; tipo = tipo + 1){
                System.out.println(areaPiscina + "\t\t" + tipo + "\t\t\t" + valorPiscina(areaPiscina, tipo));
            }
            
        }
        
        
        
        }
    }
    

