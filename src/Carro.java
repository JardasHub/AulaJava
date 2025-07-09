public class Carro {

    long qtdRetrovisor = 0;
    int qtdRodas = 0;
    String cor = null;
    double preco = 0.0;
    boolean ligado = false;
    String modelo = null;

    public Carro(){
        qtdRodas = 4;
    }

    public void ligar() {
        System.out.println("Ligando");
        ligado = true;
    }

    public void desligar() {
        System.out.println("Desligando");
        ligado = false;
    }
}