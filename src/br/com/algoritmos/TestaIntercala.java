package br.com.algoritmos;

public class TestaIntercala {

	public static void main(String[] args) {
		Nota[] notas1 = { 
			   new Nota("andre", 4), 
			   new Nota("mariana", 5), 
			   new Nota("carlos", 8.5),
			   new Nota("paulo", 9),
		};
		
		Nota[] notas2 =	{	
			   new Nota("jonas", 3),
			   new Nota("juliana", 6.7),
			   new Nota("guilherme", 7),
			   new Nota("lucia", 9.3),
			   new Nota("ana", 10)
		};
		
		Nota[] resultado = intercala(notas1, notas2);
		
		for(Nota nota : resultado) {
			System.out.println(nota.getAluno() + " - " + nota.getValor());
		}
	}
	
	/**
	 * Ordena dois arrays intercalando
	 * @param notas1
	 * @param notas2
	 * @return
	 */
	private static Nota[] intercala(Nota[] notas1, Nota[] notas2) {
		
		int total = notas1.length + notas2.length;
		
		Nota[] resultado = new Nota[total];
		
		int atualNota1 = 0;
		int atualNota2 = 0;
		int atual = 0;
		
		while(atualNota1 < notas1.length && atualNota2 < notas2.length) {
			Nota nota1 = notas1[atualNota1];
			Nota nota2 = notas2[atualNota2];
			
			if(nota1.getValor() < nota2.getValor()) {
				resultado[atual++] = nota1;
				atualNota1++;
			} else {
				resultado[atual++] = nota2;
				atualNota2++;
			}
		}
		
		while(atualNota1 < notas1.length){
			resultado[atual++] = notas1[atualNota1++];
		}
		
		while(atualNota2 < notas2.length){
			resultado[atual++] = notas2[atualNota2++];
		}
		
		return resultado;
	}

}
