package Somativa02;



public class Main {
	public static void main(String[] args) {
		Livro livro = new Livro("Mundo cercado pelos demônios", "Carl Sagan",240);
		System.out.println("O livro é: " + livro.getNome());
		System.out.println("O autor é: " + livro.getAutor());
		System.out.println("a quantidade de páginas é: " + livro.getPaginas());
}
}