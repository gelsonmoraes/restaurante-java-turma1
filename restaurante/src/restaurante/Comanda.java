package restaurante;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Comanda {
	
	  int numComanda;	
	  String nomeCliente;
	  String data;
	  String item;
	  String tipoPagamento;
	  Double total;
	  
	  Scanner entrada = new Scanner(System.in);
	  
	  //Métodos	  
	  public void abrirComanda(String nomeCliente, String data, String item, Double total) {
		 		  
		  this.numComanda ++;
		  System.out.println("A comanda de número " + numComanda +
		  " foi gerada para " + nomeCliente 
				  + " na data " + data + " com o item: " + item);  
	  }
	  
	  public void fecharComanda(String nomeCliente, String item, Double total) throws IOException {
		  
		  System.out.println("\nOs itens da comanda foram: " + item);
		  System.out.println("Total: " + total);
		  System.out.println("Comanda " + numComanda + " fechada com sucesso.");
		  
		  System.out.println("\nDeseja imprimir a comanda? 1 para Sim e 0 para não");
		  int desejaComanda = entrada.nextInt();
		  
		  if(desejaComanda == 1) {
			  imprimirComanda(nomeCliente, item, total);
		  }
	  }
	  
	  public void inserirItem() {
		  
		  
	  }
	  
	  public void cancelarItem() {
		  
	  }
	  
	  public void imprimirComanda(String nomeCliente, String item, Double total) throws IOException {
		  FileWriter arq = new FileWriter("C:/Users/treinamentosti01/Desktop/Gelson/restaurante/comanda.txt");
		  PrintWriter gravatxt = new PrintWriter(arq);
		  
		  gravatxt.print("Comanda nº " + numComanda);
		  gravatxt.print("\t  Cliente: " + nomeCliente);
		  gravatxt.println("\n\nItem:________ " + item);
		  gravatxt.print("\nTotal:_______ R$" + total);
		  
		  gravatxt.print("\n\n\nAgradecemos a preferência, volte sempre!");
		  
		  arq.close();
		  
	  }

}
