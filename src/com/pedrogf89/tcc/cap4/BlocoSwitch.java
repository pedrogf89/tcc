package com.pedrogf89.tcc.cap4;

public class BlocoSwitch {
	public static void main(String[] args) {
		int valor = 3;
		switch (valor) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
			break;
		default:
			System.out.println("Valor desconhecido");
			break;
		}
	}
}
