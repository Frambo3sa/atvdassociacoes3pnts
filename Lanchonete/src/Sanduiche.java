public class Sanduiche extends Lanchonete {
    private boolean temMolho; 

    public Sanduiche(String nome, int preco, int qtditem, boolean temMolho) {
        super(nome, preco, qtditem); 
        this.temMolho = temMolho; 
    }
    
    @Override
    public void calcularPreco() {
        int total = getPreco() * getQtditem();
        System.out.println("O preço total para " + getQtditem() + " sanduíches de " + getNome() + " é: R$ " + total);
        if (temMolho) {
            System.out.println("Este sanduíche tem molho.");
        } else {
            System.out.println("Este sanduíche não tem molho.");
        }
    }

   
    public boolean isTemMolho() {
        return temMolho;
    }

    public void setTemMolho(boolean temMolho) {
        this.temMolho = temMolho;
    }
}

//Sanduiche e Pedidos têm uma associação de composição pois não dá pra existir pedido sem sanduiche
//ele tem uma associação de herança com lanchonete