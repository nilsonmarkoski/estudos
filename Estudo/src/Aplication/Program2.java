package Aplication;

import java.util.Scanner;

import Entities.Rent;

public class Program2 {

	public static void main(String[] args) {
		//prepa para pegar os dados so usuario
		Scanner sc = new Scanner(System.in);
		//cria os 10 apartamentos 
		Rent[] vect = new Rent[10];
		//pergunta e preenche os campos
		System.out.print("How many rooms will be rented? "); 
		int n = sc.nextInt();
			for (int i=1; i<=n; i++) { 
				System.out.println();
				System.out.println("Rent #" + i + ":"); 
				System.out.print("Name: "); sc.nextLine();
				String name = sc.nextLine(); 
				System.out.print("Email: ");
				String email = sc.nextLine(); 
				System.out.print("Room: ");
				int room = sc.nextInt(); 
				vect[room] = new Rent(name, email);
			}
			//pula uma linha e mostra os quartos alugados
			System.out.println(); 
			System.out.println("Busy rooms:"); 
			for (int i=0; i<10; i++) {
				//usa diferente de null para pegar os campos preenchidos
				if (vect[i] != null) {
					System.out.println(i + ": " + vect[i]);
				} 
			}
			sc.close();
		
	}

}
