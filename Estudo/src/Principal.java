import java.util.Locale;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dig = new Scanner(System.in);
		Operacoes t = new Operacoes();
		int saida ;
		Locale.setDefault(Locale.US);
		
		do {
			t.mostraMenu();
			saida = dig.nextInt();
			switch(saida){
				case 1 : 
					double a;
					double b;
					System.out.println("Digite primeiro número da soma:");
					a = dig.nextDouble();
					System.out.println("Digite segundo número da soma:");
					b = dig.nextDouble();
					double soma = t.soma(a, b);
					System.out.println("A soma dos dois números é: "+ soma);
				break;
				case 2 : 
					double a1;
					double b1;
					System.out.println("Digite primeiro número da subtração:");
					a1 = dig.nextDouble();
					System.out.println("Digite segundo número a subtrair:");
					b1 = dig.nextDouble();
					double sub1 = t.subtracao(a1, b1);
					System.out.println("A subracao é: "+ sub1);
				break;
				case 3 : 
					double a2;
					double b2;
					System.out.println("Digite primeiro número da divisão:");
					a2 = dig.nextDouble();
					System.out.println("Digite segundo número da divisão difetente de 0:");
					b2 = dig.nextDouble();
					double div1 = t.divisão(a2, b2);
					System.out.println("A divisão dos números é: "+ div1);
				break;
				case 4 : 
					double a3;
					double b3;
					System.out.println("Digite primeiro número da multiplicação:");
					a3 = dig.nextDouble();
					System.out.println("Digite segundo número da multiplicação:");
					b3 = dig.nextDouble();
					double mult = t.multiplicao(a3, b3);
					System.out.println("A multiplicação dos dois números é: "+ mult);
				break;
								
			}
		}while(saida != 5);
		
		System.out.println("Programa Encerrado.");

	}

}
