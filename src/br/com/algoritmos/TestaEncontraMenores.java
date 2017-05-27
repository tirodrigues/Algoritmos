package br.com.algoritmos;

public class TestaEncontraMenores {
	
	public static void main(String[] args) {
		
		Nota joao = new Nota("joao", 7);
		
		Nota[] notas = {
			   new Nota("andre", 4),
			   new Nota("carlos", 8.5),
			   new Nota("ana", 10),
			   new Nota("jonas", 3),
			   new Nota("juliana", 6.7),
			   joao,
			   new Nota("paulo", 9),
			   new Nota("mariana", 5),
			   new Nota("lucia", 9.3),
		};
		
		int menores = encontraMenores(joao, notas);
		
		System.out.println(menores);
	}
	
	private static int encontraMenores(Nota nota, Nota[] notas){
		
		int menores = 0;
		
		for (int i = 0; i < notas.length; i++) {
			Nota notaAtual = notas[i];
			
			if(notaAtual.getValor() < nota.getValor())
				menores++;
		}
		
		return menores;
	}

}
