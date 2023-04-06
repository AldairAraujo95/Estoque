package Program;


	public class Produto {
	    private int id;
	    private String nome;
	    private int quantidade;
	    private double preco;

	    public Produto(int id, String nome, int quantidade, double preco) {
	        this.id = id;
	        this.nome = nome;
	        this.quantidade = quantidade;
	        this.preco = preco;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public int getQuantidade() {
	        return quantidade;
	    }

	    public void setQuantidade(int quantidade) {
	        this.quantidade = quantidade;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }
	}


