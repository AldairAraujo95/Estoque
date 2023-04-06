package Program;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(int i) {
        produtos.remove(i);
    }

    public void atualizarProduto(Produto produto) {
        for (Produto p : produtos) {
            if (p.getId() == produto.getId()) {
                p.setNome(produto.getNome());
                p.setQuantidade(produto.getQuantidade());
                p.setPreco(produto.getPreco());
                break;
            }
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

	public double getCustoTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getValorTotalVenda() {
		// TODO Auto-generated method stub
		return 0;
	}
}
