package br.com.algoritmos;

public class TestaOrdenacao {
	
	public static void main(String[] args) {
		
		Produto	produtos[] = {
			new Produto("Lamborghini", 1000000),
			new Produto("Jipe",	46000),
			new Produto("Brasília", 16000),
			new Produto("Smart", 46000),
			new Produto("Fusca", 17000)
		};
		
		selectionSort(produtos, produtos.length);
		insertionSort(produtos, produtos.length);
		 
		for (Produto produto : produtos) {
			System.out.println(produto.getNome() +" custa "+ produto.getPreco());
		}  
		
	}

	/**
	 * Ordena com o algoritmo selection sort.
	 * @param produtos
	 * @param quantidadeDeElementos
	 */
	private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
		for (int i = 0; i < quantidadeDeElementos - 1; i++) {
			
			int menor = buscaMenor(produtos, i, quantidadeDeElementos -1);
			
			trocaPosicao(produtos, i, menor);
		}
	}
	
	/**
	 * Ordena com o algoritmo insertion sort.
	 * @param produtos
	 * @param quantidadeDeElementos
	 */
	private static void insertionSort(Produto[] produtos, int quantidadeDeElementos) {
		for (int i = 1; i < quantidadeDeElementos; i++) {
			int analise = i;
			
			while(analise > 0 && produtos[analise].getPreco() < produtos[analise-1].getPreco()) {
				trocaPosicao(produtos, analise, analise - 1);
				analise--;
			}
		}
	}

	private static void trocaPosicao(Produto[] produtos, int primeiro, int segundo) {
		Produto primeiroProduto = produtos[primeiro];
		Produto segundoProduto = produtos[segundo];
		
		produtos[primeiro] = segundoProduto;
		produtos[segundo] = primeiroProduto;
	}
	
	private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
		
		int maisBarato = inicio;
		
		for (int i = inicio; i <= termino; i++) {
			if (produtos[i].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = i;
			}
		}
		return maisBarato;
	}
}
