package br.com.algoritmos;

public class TestaOrdenacaoAoIntercalar {

	public static void main(String[] args) {
		Nota[] notas = { 
			   new Nota("andre", 4), 
			   new Nota("carlos", 8.5),
			   new Nota("ana", 10),
			   new Nota("juliana", 6.7),
			   new Nota("jonas", 3),
			   new Nota("guilherme", 7),
			   new Nota("mariana", 5), 
			   new Nota("paulo", 9),
			   new Nota("lucia", 9.3),
		};
		
		ordena(notas, 0, notas.length);
		
		for(Nota nota : notas) {
			System.out.println(nota.getAluno() + " - " + nota.getValor());
		}
	}
	
	/**
	 * Ordena um array com intercalação pode ser usado para ordenar todo o array ou apenas um pedaço.
	 * @param notas array para ser odernado
	 * @param inicio index de ordenação
	 * @param miolo centro do array.
	 * @param termino index final
	 * @return array ordenado.
	 */
	private static void intercala(Nota[] notas, int inicio, int miolo, int termino) {
		
		Nota[] resultado = new Nota[termino - inicio];
		
		int atual = 0;
		int atual1 = inicio;
		int atual2 = miolo;
		
		while(atual1 < miolo && atual2 < termino) {
			Nota nota1 = notas[atual1];
			Nota nota2 = notas[atual2];
			
			if(nota1.getValor() < nota2.getValor()) {
				resultado[atual++] = nota1;
				atual1++;
			} else {
				resultado[atual++] = nota2;
				atual2++;
			}
		}
		
		while(atual1 < miolo){
			resultado[atual++] = notas[atual1++];
		}
		
		while(atual2 < termino){
			resultado[atual++] = notas[atual2++];
		}
		
		for (int i = 0; i < atual; i++) {
			notas[inicio + i ] = resultado[i];
		}
	}
	
	private static void ordena(Nota[] notas, int inicio, int termino) {
		
		if(termino - inicio <= 1)
			return;
		
		int meio = (inicio + termino) / 2;
		
		ordena(notas, inicio, meio);
		ordena(notas, meio, termino);
		intercala(notas, inicio, meio, termino);
	}

}
