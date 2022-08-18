package view;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {

		FatorialController n = new FatorialController();
		int resultado = n.fatorial(12);
		System.out.println(resultado);		
	}

}