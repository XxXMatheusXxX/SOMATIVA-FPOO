package Somativa01;

public class Main extends Produto {

	public static void main(String[] args) {

		Produto prod = new Produto(01, "toalha de banho", 3);

		System.out.println("O id do produto é: " + prod.getId());
		System.out.println("O produto é: " + prod.getProduto());
		System.out.println("A quantidade de produtos é: " + prod.getQuantidade());

	}
}
