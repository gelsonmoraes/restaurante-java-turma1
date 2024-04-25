package restaurante;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

	public void menu() throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		int controle = 1;
		
			
		System.out.println("Olá, seja bem vindo ao RestauranteApp!");
		do {
			System.out.println("O que você deseja fazer? \n\n");
			System.out.println("________________________________");
			System.out.println("|\t1 - Abrir Comanda \t|");
			System.out.println("|\t2 - Fechar Comanda \t|");
			System.out.println("|\t3 - Abrir Delivery \t|");
			System.out.println("|\t4 - Fechar Delivery \t|");
			System.out.println("|\t5 - Cadastrar Cliente \t|");
			System.out.println("|\t6 - Cadastrar Atendente |");
			System.out.println("|\t0 - Sair \t\t|");
			System.out.println("---------------------------------");
			controle = entrada.nextInt();	
			
			switch(controle) {
				case 0:
					System.out.println("Você escolheu sair.");
					controle = 0;
					break;
				case 1:
					Comanda cmd = new Comanda();
					System.out.println("Digite o nome do cliente: ");
					String nomeCliente = entrada.next();
					System.out.println("Digite a data: ");
					String data = entrada.next();
					System.out.println("Digite o nome do item: ");
					String item = entrada.next();
					System.out.println("Digite o preço do item: ");
					Double preco = entrada.nextDouble();
					cmd.abrirComanda(nomeCliente, data, item, preco);
					break;
					
				case 2:
					cmd = new Comanda();
					System.out.println("Digite o nome do Cliente: ");
					nomeCliente = entrada.next();
					System.out.println("Digite o nome do item: ");
					item = entrada.next();
					System.out.println("Digite o preço do item: ");
					preco = entrada.nextDouble();
					cmd.fecharComanda(nomeCliente, item, preco);
					break;
				case 3:
					Delivery dlv = new Delivery();
					System.out.println("Digite o nome do cliente: ");
					nomeCliente = entrada.next();
					System.out.println("Digite a data: ");
					data = entrada.next();
					System.out.println("Digite o nome do item: ");
					item = entrada.next();
					dlv.abrirDelivery();
					break;
				case 4:
					dlv = new Delivery();
					dlv.fecharDelivery();
					break;
				case 5:
					Cliente cli = new Cliente();
					cli.cadastrarCliente();
					break;
				case 6:
					Atendente atd = new Atendente();
					atd.cadastrarAtendente();
					break;
				default:
					System.out.println("\n Opção inválida.");
			}
		} while (controle != 0);
	}
}
