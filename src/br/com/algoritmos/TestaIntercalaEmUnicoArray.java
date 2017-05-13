package br.com.algoritmos;

public class TestaIntercalaEmUnicoArray {

	public static void main(String[] args) {
		Nota[] notas = { 
			   new Nota("andre", 4), 
			   new Nota("mariana", 5), 
			   new Nota("carlos", 8.5),
			   new Nota("paulo", 9),
			  
			   new Nota("jonas", 3),
			   new Nota("juliana", 6.7),
			   new Nota("guilherme", 7),
			   new Nota("lucia", 9.3),
			   new Nota("ana", 10)
		};
		
		Nota[] resultado = intercala(notas, 1, 4, notas.length - 1);
		
		for(Nota nota : resultado) {
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
	private static Nota[] intercala(Nota[] notas, int inicio, int miolo, int termino) {
		
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
		
		return notas;
	}

}
