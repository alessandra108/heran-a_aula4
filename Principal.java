package aplicacao;

import entidade.ContaComercial;

public class Principal {

	public static void main(String[] args) {
		
		
		ContaComercial cc = new ContaComercial("Ale", 1958, 0, 200);
		cc.deposito(100);
		
		System.out.println(cc.agua());
	} 
	}


