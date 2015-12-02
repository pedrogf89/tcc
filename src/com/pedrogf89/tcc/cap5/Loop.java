package com.pedrogf89.tcc.cap5;

public class Loop {
	public static void main(String[] args) {
		int i = 1;

		while (i <= 10) {
			System.out.println(i++);

		}
		System.out.println("Do...While");
		do {
			System.out.println(i--);
		} while (i > 20);

	}

}
