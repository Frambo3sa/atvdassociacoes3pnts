public abstract class Lanchonete {
    private String nome;
    private int preco;
    private static int contador = 0;
    private int id;
    private int qtditem;
    
    public Lanchonete(String nome, int preco, int qtditem) {
        this.nome = nome;
        this.id = ++contador; 
        this.qtditem = qtditem; 
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtditem() {
        return qtditem;
    }

    public void setQtditem(int qtditem) {
        this.qtditem = qtditem;
    }

    public abstract void calcularPreco();
}

//tem uma associação de agregação com pedidos pois eles coexistem sem depender um do outro, mas se complementam
//relação de herança com bebidas e sanduiche