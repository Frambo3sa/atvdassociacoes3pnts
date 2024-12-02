import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Sanduiche> sanduiches = new ArrayList<>();
        List<Bebidas> bebidas = new ArrayList<>();
        Pedidos pedido = new Pedidos(); 

        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro do Sanduíche " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Preço: ");
            int preco = scanner.nextInt();
            System.out.print("Quantidade: ");
            int qtditem = scanner.nextInt();
            System.out.print("Tem molho (true/false): ");
            boolean temMolho = scanner.nextBoolean();
            scanner.nextLine();

            Sanduiche sanduiche = new Sanduiche(nome, preco, qtditem, temMolho);
            sanduiches.add(sanduiche);
            pedido.adicionarItem(sanduiche);  
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro da Bebida " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Preço: ");
            int preco = scanner.nextInt();
            System.out.print("Quantidade: ");
            int qtditem = scanner.nextInt();
            System.out.print("Tem leite (true/false): ");
            boolean temLeite = scanner.nextBoolean();
            scanner.nextLine();

            Bebidas bebida = new Bebidas(nome, preco, qtditem, temLeite);
            bebidas.add(bebida);
            pedido.adicionarItem(bebida); 
            System.out.println();
        }

        System.out.println("Informações dos Sanduíches:");
        for (Sanduiche sanduiche : sanduiches) {
            System.out.println("Nome: " + sanduiche.getNome());
            System.out.println("Preço: R$ " + sanduiche.getPreco());
            System.out.println("Quantidade: " + sanduiche.getQtditem());
            System.out.println("Tem molho: " + (sanduiche.isTemMolho() ? "Sim" : "Não"));
            sanduiche.calcularPreco(); 
            System.out.println();
        }

        System.out.println("Informações das Bebidas:");
        for (Bebidas bebida : bebidas) {
            System.out.println("Nome: " + bebida.getNome());
            System.out.println("Preço: R$ " + bebida.getPreco());
            System.out.println("Quantidade: " + bebida.getQtditem());
            System.out.println("Tem leite: " + (bebida.isTemLeite() ? "Sim" : "Não"));
            bebida.calcularPreco(); 
            System.out.println();
        }

        pedido.calcularPreco(); 

        scanner.close();
    }
}