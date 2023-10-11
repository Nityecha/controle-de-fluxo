package Contador;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws ParametrosException {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parametro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parametro");
		int parametroDois = terminal.nextInt();

		try {
			contar(parametroUm, parametroDois);

		} catch (ParametrosException e) {
			System.out.println("Erro");
		} finally {
			if (terminal != null)
				terminal.close();
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosException("O segundo parametro deve ser maior que o primeiro: ");

		}
		int contagem = parametroDois - parametroUm;
		for (int i = 1; contagem >= i; i++) {
			System.out.println("imprimindo numero " + i);

		}
	}
}
