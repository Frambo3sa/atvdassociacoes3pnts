import java.util.ArrayList;
import java.util.List;

public class Pedidos extends Lanchonete {
    private int idp;
    private static int contador = 0; 
    private List<Lanchonete> itens; 

    public Pedidos() {
        super("Pedido " + (contador + 1), 0, 0); 
        this.idp = ++contador; 
        this.itens = new ArrayList<>(); 
    }

    public void adicionarItem(Lanchonete item) {
        itens.add(item);
    }

    @Override
    public void calcularPreco() {
        int total = 0;
        for (Lanchonete item : itens) {
            total += item.getPreco() * item.getQtditem(); 
        }
        System.out.println("O preço total do pedido " + idp + " é: R$ " + total);
    }

    public List<Lanchonete> getItens() {
        return itens;
    }
}

// tem associação de composição com Bebidas e Sanduiche, pois não dá pra existir pedidos sem essas classes
// tem associação de agregação com lanchonete, pois lanchonete não precisa de pedidos para existir