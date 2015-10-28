package com.pedrogf89.tcc.cap4;

public class Acesso {

}

// Classe final nao pode ser extendida
// abstract class X { classe abstrata nao pode ser instaciada
class X {
	String a;

	//abstract void imprime(); Metodos abstract tem que ficar dentro de classes abstract

	public String getA() {
		return a;
	}
//Argumentos de metodos podem possuir modificador de acesso final para nao sofrerem modificacoes
	public void setA(final String a) {
		this.a = a;
	}
}

class Y {
	void acessar() {
		X x = new X();
		x.a = "Teste";
		x.getA();
		x.setA("Teste2");
	}
}

class Z extends X {
	void acessar() {
		a = "Teste";
		getA();
		setA("Teste2");
	}
}