package com.pedrogf89.tcc.cap4;

public class OperadoresLogicos {
	static boolean imprime(String string) {
		System.out.println(string);
		return true;
	}

	public static void main(String[] args) {
		// Operadores que sempre verificam os dois lados da expressao
//		System.out.println(2 == 2 & 2 > 3);// false
//		System.out.println(2 == 2 | 3 > 2);// true
//		System.out.println(2 == 2 ^ 3 > 2);// false
//		System.out.println(!(2 == 2)); // false

		// Operadores que so percorrem toda expressao caso seja necessario
		int a = 5;
		System.out.println(a == 5 | a++ == 20);//true
		System.out.println(a);//a=6
		System.out.println(a == 6 || a++ == 20);//true
		System.out.println(a);//a=6
		
//		System.out.println(a == 10 & imprime("Oi"));
//		System.out.println(a == 10 && imprime("Teste"));

	}

}
