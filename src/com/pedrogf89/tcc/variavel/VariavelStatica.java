package com.pedrogf89.tcc.variavel;

public class VariavelStatica {
	static int var = 10;

	public static void main(String[] args) {
		VariavelStatica vS = new VariavelStatica();
		System.out.println(vS.var);
		System.out.println(VariavelStatica.var);
	}

}
