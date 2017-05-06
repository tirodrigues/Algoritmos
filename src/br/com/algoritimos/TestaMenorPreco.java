package br.com.algoritimos;

public class TestaMenorPreco {

	public static void main(String[] args) {

		Produto produtos[] = {
				new Produto("Lamborghini", 1000000),
				new Produto("Jipe", 46000),
				new Produto("Brasília", 16000),
				new Produto("Smart", 46000),
				new Produto("Fusca", 17000),
				null, 
				null,
				null,
		};

		int maisBarato = buscaMenor(produtos, 0, 4);

		System.out.println("mais barato e " + produtos[maisBarato].getPreco());
	}

	private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
		
		int maisBarato = 0;
		
		for (int i = inicio; i <= termino; i++) {
			if (produtos[i].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = i;
			}
		}
		return maisBarato;
	}
}
