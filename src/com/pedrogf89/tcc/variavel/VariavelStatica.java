package com.pedrogf89.tcc.variavel;

class TesteVar {
	static int var = 10;

}

public class VariavelStatica {
	public static void main(String[] args) {
		TesteVar vS = new TesteVar();
		System.out.println(vS.var);
		System.out.println(TesteVar.var);
	}

}
