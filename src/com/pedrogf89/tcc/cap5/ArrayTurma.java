package com.pedrogf89.tcc.cap5;

public class ArrayTurma {

	public static void main(String[] args) {
		int notas[] = new int[2];
		int[] dias = { 1, 2 };
		String alunos[] = new String[2];
		notas[0] = 10;
		notas[1] = 5;
		alunos[0] = new String("Pedro");
		alunos[1] = new String("Gabriel");
		
		for (String string : alunos) {
			System.out.println(string);
		}
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

	}

}
