package Somativa01;

public class Produto {
	private long id;
	private String produto;
	private int quantidade;

	public Produto() {

	}

	public Produto(long id, String produto, int quantidade) {
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
