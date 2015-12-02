package com.pedrogf89.tcc.cap6;

public class Polimorfismo {
	static void velocidade(Corre corre) {}
	public static void main(String[] args) {
		
		velocidade(new Corre());
		velocidade(new Carro());
		velocidade(new Pessoa());
		velocidade(new Agua());
		
	}
}

class Corre {}
class Carro extends Corre {}
class Pessoa extends Corre {}
class Agua extends Corre {}
