//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando Carro");
        String proprietario = "Luís";
        Carro veiculoComercialGustavo = new Carro();
        veiculoComercialGustavo.cor = "Preto";
        veiculoComercialGustavo.preco = 9000;
        veiculoComercialGustavo.qtdRetrovisor = 6;
        veiculoComercialGustavo.qtdRodas = 3;

        veiculoComercialGustavo.modelo = "Kwid do Luís";
        veiculoComercialGustavo.ligar();
        System.out.println(proprietario + veiculoComercialGustavo.modelo);

        Carro veiculoPessoalJose = new Carro();
        veiculoPessoalJose.cor = "CEM carros";
        veiculoPessoalJose.modelo = "Fiat Uno 2013";
        veiculoPessoalJose.preco = 70000;
        veiculoPessoalJose.qtdRodas = 7;
        veiculoPessoalJose.ligar();
        veiculoPessoalJose.desligar();
        System.out.println(proprietario + " (com acento) tem um " + veiculoPessoalJose.modelo);

        Carro[] carros = new Carro[100];
        for(int i = 0; i < 100; i++){
            carros[i] = new Carro();
            carros[i].cor = "Preto" + i;
            carros[i].preco = 10 * i;
            carros[i].ligar();
        }

        for(Carro carro: carros){
            carro.desligar();
        }
    }
}