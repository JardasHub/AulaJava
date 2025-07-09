import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa Jardel = new Pessoa();
        Jardel.nome = "Jardel";
        Jardel.sobrenome = "Cristiano Oliveira";
        Jardel.cpf = "12345678910";
        Jardel.rg = "12345";
        Jardel.telefones[0] = "48 984565495";
        Jardel.dataNascimento = LocalDate.of(2006, 06, 11);

        Jardel.imprimirValores();
        Jardel.criarCarro("preto");

        Paciente jardel = new Paciente();
        jardel.peso = 82.3;
        jardel.altura = 1.37;

        System.out.println(jardel.calcularIndiceDeMassaCorporal(jardel.peso, jardel.altura));





//        System.out.println("Iniciando Carro");
//        String proprietario = "Luís";
//        Carro veiculoComercialGustavo = new Carro();
//        veiculoComercialGustavo.cor = "Preto";
//        veiculoComercialGustavo.preco = 9000;
//        veiculoComercialGustavo.qtdRetrovisor = 6;
//        veiculoComercialGustavo.qtdRodas = 3;
//
//        veiculoComercialGustavo.modelo = "Kwid do Luís";
//        veiculoComercialGustavo.ligar();
//        System.out.println(proprietario + veiculoComercialGustavo.modelo);
//
//        Carro veiculoPessoalJose = new Carro();
//        veiculoPessoalJose.cor = "CEM carros";
//        veiculoPessoalJose.modelo = "Fiat Uno 2013";
//        veiculoPessoalJose.preco = 70000;
//        veiculoPessoalJose.qtdRodas = 7;
//        veiculoPessoalJose.ligar();
//        veiculoPessoalJose.desligar();
//        System.out.println(proprietario + " (com acento) tem um " + veiculoPessoalJose.modelo);
//
//        Carro[] carros = new Carro[100];
//        for(int i = 0; i < 100; i++){
//            carros[i] = new Carro();
//            carros[i].cor = "Preto" + i;
//            carros[i].preco = 10 * i;
//            carros[i].ligar();
//            System.out.println(carros[i].preco + i);
//        }
//
//        for(Carro carro: carros){
//            carro.desligar();
//        }
    }

}