package com.pedrogf89.tcc.cap4;

public class ComparacaoString {
	public static void main(String[] args) {
		String nome = "Pedro";
		String nome2 = "Pedro";
		String nome3 = new String("Pedro");
		
		System.out.println(nome == nome2); //true
		System.out.println(nome == nome3); //false
		System.out.println(nome.equals(nome3)); //true
	}
}
