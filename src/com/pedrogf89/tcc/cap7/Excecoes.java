package com.pedrogf89.tcc.cap7;

import java.io.IOException;
import java.sql.SQLException;

public class Excecoes {
	void metodo1() {
		try {
			metodo2();

		} catch (IOException e) {
			System.out.println("io");
		} catch (SQLException e) {
			System.out.println("sql");
		} catch (Exception e) {
			System.out.println("e");
		} finally {
			System.out.println("Fim");
		}
	}

	private void metodo2() {

	}

}
