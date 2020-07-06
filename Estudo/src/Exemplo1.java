import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int c;
		int d;
		System.out.println("Digite um número inteiro.");
		c = sc.nextInt();
		System.out.println("Digite outro número inteiro.");
		d = sc.nextInt();
		
		int soma = c + d;
		
		System.out.println("A soma de c + d é :"+ soma);
	
		
		sc.close();
	}

}
