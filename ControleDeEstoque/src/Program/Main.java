package Program;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto produto1 = new Produto(1, "Produto 1", 10, 5.0);
        estoque.adicionarProduto(produto1);

        Produto produto2 = new Produto(2, "Produto 2", 5, 10.0);
        estoque.adicionarProduto(produto2);

        List<Produto> produtos = estoque.getProdutos();
        System.out.println("Produtos no estoque:");
        for (Produto produto : produtos) {
            System.out.println(produto.getId() + " - " + produto.getNome() + " - " + produto.getQuantidade() + " - " + produto.getPreco());
        }

        Produto produto3 = new Produto(2, "Produto 2 atualizado", 7, 15.0);
        estoque.atualizarProduto(produto3);

        System.out.println("Produtos no estoque após atualização:");
        for (Produto produto : produtos) {
            System.out.println(produto.getId() + " - " + produto.getNome() + " - " + produto.getQuantidade() + " - " + produto.getPreco());
        }

        Produto produto4 = new Produto(3, "Produto 3", 20, 7.5);
        estoque.adicionarProduto(produto4);

        System.out.println("Produtos no estoque após adição de produto:");
        for (Produto produto : produtos) {
            System.out.println(produto.getId() + " - " + produto.getNome() + " - " + produto.getQuantidade() + " - " + produto.getPreco());
        }

        estoque.removerProduto(1);
        System.out.println("Produtos no estoque após remoção do produto 1:");
        for (Produto produto : produtos) {
            System.out.println(produto.getId() + " - " + produto.getNome() + " - " + produto.getQuantidade() + " - " + produto.getPreco());
        }

        double custoTotal = estoque.getCustoTotal();
        System.out.println("Custo total do estoque: R$ " + custoTotal);

        double valorTotalVenda = estoque.getValorTotalVenda();
        System.out.println("Valor total de venda do estoque: R$ " + valorTotalVenda);

        double lucroTotal = estoque.getCustoTotal();
        System.out.println("Lucro total do estoque: R$ " + lucroTotal);
    }
}

