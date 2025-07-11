public class ProdutoEstoque {
    private String nome;
    private int estoque;


    public String getNome(){
        return nome;
    }

    public int getEstoque(){
        return estoque;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void adicionarEstoque(int estoque){
         this.estoque += estoque;
    }

    public void retirarEstoque(int estoque) throws Exception{
        if(estoque > this.estoque){
            throw new Exception("Estoque menor que estoque: " + this.estoque);
        }
        verificarEstoqueMinimo();
        this.estoque -= estoque;

        System.out.println("Produto retirado com sucesso)");

    }

    private void verificarEstoqueMinimo() {
        if (this.estoque < 5) {
            System.out.println("ESTOQUE ABAIXO DO REMCOMNEOfasfdFJODABNFJISDA");
        }
    }
}