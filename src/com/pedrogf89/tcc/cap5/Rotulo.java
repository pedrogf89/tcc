package com.pedrogf89.tcc.cap5;

public class Rotulo {

	public static void main(String[] args) {

		externo: for (int i = 0; i <= 5; i++) {
			System.out.println("\n" + "Valor de i: " + i);
			interno: for (int j = 0; j < 5; j++) {
				if (i == 2 && j >= 1) {
					continue interno;
				}
				System.out.print(j + " ");
				if (i >= 3 && j >= 2) {
					break externo;
				}
			}
		}
	}
}
