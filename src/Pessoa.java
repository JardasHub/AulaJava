import java.time.LocalDate;

public class Pessoa {
    public TipoPessoa tipo = TipoPessoa.FISICA;
    public String nome;
    public String sobrenome;
    public String cpf;
    public String rg;
    public LocalDate dataNascimento;
    public String[] telefones = new String[5];

/*
   public void trocarTipoPessoa(TipoPessoa tipo){
        if(tipo ==  TipoPessoa.FISICA){
            this.tipo = TipoPessoa.JURIDICA;
        }else{
            this.tipo = TipoPessoa.FISICA;
        }
    }
*/
    public void trocarTipoPessoa(TipoPessoa tipos){
        if(tipos ==  TipoPessoa.FISICA){
            tipo = TipoPessoa.JURIDICA;
        }else{
            tipo = TipoPessoa.FISICA;
        }
    }

    public void imprimirValores(){
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Nascimento: " + dataNascimento);

/*
        for(String telefone : telefones){
            if(telefone != null){
            System.out.println(telefone);
            }
        }
*/

        for(int i = 0; i < telefones.length; i++) {
            if (telefones[i] != null){
                System.out.println(telefones[i]);
            }
        }
    }

    public int somar ( int primeiroN, int segundoN){
        return(primeiroN + segundoN);
    }

    public Carro criarCarro(String cor){
        Carro carro = new Carro();
        carro.cor = cor;
        return carro;
    }




}
