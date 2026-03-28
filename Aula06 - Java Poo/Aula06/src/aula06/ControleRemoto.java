
package aula06;

public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligando;
    private boolean tocando;
    //Metodos especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligando = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private boolean getLigando() {
        return ligando;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigando(boolean ligando) {
        this.ligando = ligando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //Metodos abstratos

    @Override
    public void ligar() {
        this.setLigando(true);
    }

    @Override
    public void desligar() {
        this.setLigando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("---- Menu ----");
        System.out.println("Esta ligado? " + this.getLigando());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print(" |");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigando()){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossivel aumentar Volume!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigando()){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossivel diminuir Volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigando() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigando() && this.getVolume() == 0){
            this.setVolume(50);
    }
    }

    @Override
    public void play() {
        if (this.getLigando() && !(this.getTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Nao consegui Reproduzir!");
        }
    }

    @Override
    public void pause() {
        if (this.getLigando() && !(this.getTocando())){
            this.setTocando(false);
        } else {
            System.out.println("Nao consegui Pausar!");
    }
}
}
