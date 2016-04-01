package com.pedrogf89.tcc.cap4;

public class EstruturaIF {
	public static void main(String[] args) {
//		ifInteressante();
//		ifNaoEstruturado();

	}

	private static void ifInteressante() {
		boolean aprovado = true;
		if(aprovado)
		System.out.println("Aprovado");
		else
			System.out.println("Recusado");
			System.out.println("Tente Novamente");
	}

	private static void ifNaoEstruturado() {
		int valor = 100;
		if (valor > 200)
		if (valor < 400)
		if (valor > 300)
		System.out.println("a");
		else
		System.out.println("b");
		else
		System.out.println("c");
	}
}
