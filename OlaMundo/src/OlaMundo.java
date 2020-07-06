import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double nun1,nun2,soma ,subtracao;
		System.out.println("Digite o primeiro número :");
		nun1 = in.nextDouble();
		System.out.println("Digite o segundo número :");
		nun2 = in.nextDouble();
		
		soma = nun1+nun2;
		subtracao =nun1-nun2;
		
		System.out.println("A soma é :"+ soma);
		
		System.out.println("A subtração é :"+ subtracao);
		
	}
}
