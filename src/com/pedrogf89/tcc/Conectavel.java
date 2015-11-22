package com.pedrogf89.tcc;

interface  Conectavel{
	final int TENTATIVAS = 3;
	void conecta(String user, String password);

}
