package Aplication;
import java.util.Locale;
import java.util.Scanner;

import Entities.Produto;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//seto o ponto para dado americano
		Locale.setDefault(Locale.US);
		//estancio o objeto sc da cladsse scanner
		Scanner sc = new Scanner(System.in);
		//crio o objeto product da classe Produto
		Produto product = new Produto();
		//Interação com o usuário para pegar dados 
		System.out.print("Entre com o Nome do produto:");
		//objeto pega atribuição name do teclado com metodo de scanner
		product.name = sc.nextLine();
		System.out.print("digite o preço:");
		product.price = sc.nextDouble();
		System.out.print("Digite a quantidade:");
		product.quantity = sc.nextInt();
		System.out.println("");
		System.out.println("Product data : "+product);
		System.out.println("");
		System.out.println("Entre com a quantidade adicional do produto!");
		int quantity = sc.nextInt();
		//aqui uso o metodo criado para adiocionar produtos 
		product.addProducts(quantity);
		System.out.println("Update data: "+ product);
		System.out.println("Entre com a quantidade removidos do estoque!");
		quantity = sc.nextInt();
		//aqui uso o metodo para retirar produtos 
		product.removeProducts(quantity);
		System.out.println("Update data: "+ product);
		
		//fecho e destruo memória scanner
		sc.close();
	}

}
