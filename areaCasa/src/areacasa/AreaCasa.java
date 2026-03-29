
package areacasa;
 
public class AreaCasa {

    public static void main(String[] args) {
        double areaPiscina;
        areaCasa(11,7);
        
        
        areaPiscina = areaPiscina(2);
        System.out.println("Area da Piscina: " + areaPiscina);
        
    }
    
    static void areaCasa(float paramLateral, float paramComprimentoQuartoBanheiro){
        float areaQuartoBanheiro;
        float areaSala;
        float areaTotal;
        
        
        areaSala = paramLateral*paramLateral;
        System.out.println("Area da Sala: " + areaSala);
        areaQuartoBanheiro = paramComprimentoQuartoBanheiro*(paramLateral/2);
        System.out.println("Area Quarto: " + areaQuartoBanheiro);
        System.out.println("Area Banheiro: " + areaQuartoBanheiro);
        areaTotal = areaSala + 2* areaQuartoBanheiro;
        System.out.println("Area Total: " + areaTotal);
       
        
    }
    static double areaPiscina(double paramRaio){
        return (Math.PI * Math.pow(paramRaio, 2));
    }
}
