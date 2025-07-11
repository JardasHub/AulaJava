import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Calculadora jardeis = new Calculadora();
//        System.out.println(jardeis.maior(2, 6));

//       String[] nomePessoas = new String[15];
//       nomePessoas [0] = "Juan";

        List<String> listaPessoas = new ArrayList<>();
        listaPessoas.add("JoãoJS");
        listaPessoas.add("Luís gayzão");
        listaPessoas.add(0, "Mairo");

        System.out.println(listaPessoas.contains("JoãoJS")? "contem essa cois aia ": " nao contem aiaia");

        for(String pessoa: listaPessoas){
            if(pessoa == "Mairo"){
                System.out.println("tbm");
            }
            System.out.println(pessoa);
        }
    }






















    public static void animal(){
        Animal animal = new Animal();
        animal.definirRaca("Cachorrão");
        System.out.println(animal.getRaca());
    }

    public static void criarAnimal(){};

    public static void Pessoa(){
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
        jardel.peso = 74.5;
        jardel.altura = 1.81;

        System.out.println(jardel.calcularIndiceDeMassaCorporal(jardel.peso, jardel.altura));
    }

    public static void Carro(){
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
            System.out.println(carros[i].preco + i);
        }

        for(Carro carro: carros){
            carro.desligar();
        }
    }

    public static void criarProduto(){

        ProdutoEstoque produto = new ProdutoEstoque();
        boolean continuar;
        do{
            try{
                System.out.println("Quanto você quer RETIRAR?");
                int qtd = new Scanner(System.in).nextInt();
                produto.retirarEstoque(qtd);
                System.out.println("Deseja continuar? (S/N)");
                continuar = new Scanner(System.in).next().toLowerCase().charAt(0) == 'S';
            }catch (Exception e){
                System.out.println(e.getMessage());
                continuar = true;
            }
        }while(continuar);
        }

}