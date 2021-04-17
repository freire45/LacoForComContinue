package br.com.erickfreire.lacoforcomcontinue;

/**
 * Programa em Java que testa o laço for com continue
 * @author Erick Freire
 * @version 1 - Criado em 17-04-2021 as 14:47
 */

public class LacoForComContinue {
	public static void main(String[] args) {
		
		for(int contador = 1; contador <= 10; contador++) {
			
			if(contador == 5)
				continue;
			
			System.out.printf("%d ", contador);
			
		}
		
		System.out.println("\nUsado para pular o passo 5\n");
	}

}
