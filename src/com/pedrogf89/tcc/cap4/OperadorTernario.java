package com.pedrogf89.tcc.cap4;

public class OperadorTernario {
	public static void main(String[] args) {
		int i = 3;
		System.out.println(i==3?"Sim":"Não");
		System.out.println(i==4?i:++i);
	}
}
