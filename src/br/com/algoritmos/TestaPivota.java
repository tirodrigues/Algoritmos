package br.com.algoritmos;

public class TestaPivota {
	
	public static void main(String[] args) {
		
		Nota joao = new Nota("joao", 7);
		
		Nota[] notas = {
			   new Nota("andre", 4),
			   new Nota("carlos", 8.5),
			   new Nota("ana", 10),
			   new Nota("jonas", 3),
			   new Nota("juliana", 6.7),
			   new Nota("paulo", 9),
			   new Nota("mariana", 5),
			   new Nota("lucia", 9.3),
			   joao,
		};
		
		quebraNoPivo(notas, 0, notas.length );
		
		for (Nota nota : notas) {
			System.out.println(nota.getAluno() + " " + nota.getValor() );
		}
		
	}
	
	private static void quebraNoPivo(Nota[] notas, int inicial, int termino ) {
		int menoresEncontrados = 0;
		
		Nota pivo = notas[termino -1];
		
		for (int i = 0; i < termino -1; i++) {
			Nota atual = notas[i];
			
			if(atual.getValor() <= pivo.getValor())
			   menoresEncontrados++;
		}
		
		troca(notas, termino -1, menoresEncontrados);
	}
	
	private static void troca(Nota[] notas, int de, int para) {
		Nota nota1 = notas[de];
		Nota nota2 = notas[para];
		notas[de] = nota2;
		notas[para] = nota1;
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
