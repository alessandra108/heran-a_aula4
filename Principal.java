package aplicacao;

import entidade.ContaComercial;

public class Principal {

	public static void main(String[] args) {
		
		
		System.out.print("Bem-vindo ao Banco do Itau! ");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("quantas contas voce deseja cadastrar? ");
        int n = scn.nextInt();
        
        for(int i= 1 ; i <= n ; i++) {
        	System.out.print("digite C para conta corrente ou P para poupança: ");
        	String x = scn.next();
        	List<Conta> lista = new ArrayList<>();
        	
        	if(x.equals("C")) {
        		
        		System.out.print("digite o nome do dono da conta: " + i);
        		String nome = scn.next();
        		
        		System.out.println("digite o numero: ");
        		int numero = scn.nextInt();
        		
        		System.out.println("digite o saldo: ");
        		double saldo = scn.nextDouble();
        		
        		System.out.println("digite o limite: ");
        		double limite = scn.nextDouble();
        		
        		
        		Conta conta = new Corrente(nome, numero, saldo, limite);
        		lista.add(conta);
        	}
        	else {
        		System.out.print("digite o nome do dono da conta: " + i);
        		String nome = scn.next();
        		
        		System.out.println("digite o numero: ");
        		int numero = scn.nextInt();
        		
        		System.out.println("digite o saldo: ");
        		double saldo = scn.nextDouble();
        		
  
        		lista.add( new Poupanca(nome, numero, saldo));
        		
        	}
        	
        	System.out.println(lista);
	}

	}



