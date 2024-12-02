public class Bebidas extends Lanchonete {
    private boolean temLeite; 

    public Bebidas(String nome, int preco, int qtditem, boolean temLeite) {
        super(nome, preco, qtditem); 
        this.temLeite = temLeite; 
    }
    
    @Override
    public void calcularPreco() {
        int total = getPreco() * getQtditem();
        System.out.println("O preço total para " + getQtditem() + " bebidas de " + getNome() + " é: R$ " + total);
        if (temLeite) {
            System.out.println("Esta bebida tem leite.");
        } else {
            System.out.println("Esta bebida não tem leite.");
        }
    }

    public boolean isTemLeite() {
        return temLeite;
    }

    public void setTemLeite(boolean temLeite) {
        this.temLeite = temLeite;
    }
}

// em relação a pedidos é uma associação de COMPOSIÇÃO pois não tem como existir pedidos sem a classe bebidas(e sanduíche tbm)
// em relação a lanchonete eles têm apenas uma associação de herança