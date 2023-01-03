package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		//Generics
		List<Conta> lista = new LinkedList<>();

		ArrayList<Conta> nomes = new ArrayList<>();

		Conta cc = new ContaCorrente(22,11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22,22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22,22);
		boolean existe = lista.contains(cc2);

		System.out.println("Já existe? " + existe);

		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
