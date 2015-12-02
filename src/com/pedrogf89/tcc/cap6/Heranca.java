package com.pedrogf89.tcc.cap6;

public class Heranca {
	public static void main(String[] args) {
		Motor m = new Veiculo();
		m.chave(true);
	}
}

class Motor {
	void chave(boolean liga) {
		if (liga) {
			System.out.println("ligado");
		} else {
			System.out.println("desligado");
		}

	}
}
	class Veiculo extends Motor {
		void chave(boolean liga) {
			if (liga) {
				System.out.println("Veiculo ligado");
			} else {
				System.out.println("Veiculo desligado");
			}
		}
	}
