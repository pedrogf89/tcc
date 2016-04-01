package com.pedrogf89.tcc.cap4;

/*Codigo com declaracoes estranhas e para verificar a ordem de incremento

*/
import java.lang.*;

public class $_o0o_$ {
	public static void main(String[] args) {
		int $$ = 5;
		int __ = $$++;
		// __ recebe 5 e depois $$ recebe 6 
		if (__ < ++$$ || __-- > $$)
			// __ e menor que $$ que incrementou em 1 virando 7
			// segundo bloco || e ignorado, pois o primeiro e true
			System.out.print("A");

		System.out.print($$);
		System.out.print(__);

	}
}