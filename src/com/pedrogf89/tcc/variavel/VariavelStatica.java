package com.pedrogf89.tcc.variavel;

public class VariavelStatica {
	static int var = 10;
	String nome;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static void main(String[] args) {

		VariavelStatica vS = new VariavelStatica();
		vS.setNome("Pedro");
		System.out.println(vS.var);
		System.out.println(VariavelStatica.var);
	}

}
