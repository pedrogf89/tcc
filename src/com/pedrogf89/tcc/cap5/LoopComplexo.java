package com.pedrogf89.tcc.cap5;

public class LoopComplexo {

	public static void main(String[] args) {
		int i = 0;
		while (true) {
			i++;
			if (i == 5)
				break;
		}

		for (i = 0; i <= 5; i++) {
			if (i == 3)
				continue;
			System.out.println(i);
		}

	}

}
