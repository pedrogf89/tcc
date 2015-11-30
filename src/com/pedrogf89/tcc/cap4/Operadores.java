package com.pedrogf89.tcc.cap4;

import java.util.ArrayList;
import java.util.List;

public class Operadores {

	public void inicio(){
		
		//Tipos primitivos recebem copia do valor
		//Tipos não primitivos recebem referencias
		int total = 15;
		int total2 = total;
		List<String> list = new ArrayList<>();
		list.add("Pedro");
		List<String> list2 = list;
		list2.add("Gabriel");
		total2++;
		System.out.println(list);
		System.out.println(list==list2);
		System.out.println(total==total2);
		System.out.println(total +", "+ total2);
		
		
		//Operadores aritimeticos
		
		int dois = 2;
		int dez = 10;
		int doze = dez + dois;
		int oito = dez - dois;
		int vinte = dez * dois;
		int cinco = dez / dois;
		int zero = dez % dois;
		long tempo = doze * cinco;
		//Não compila int não recebe long
//		int tempo2 = tempo + oito;
		
		
		
		
		
	}
}
