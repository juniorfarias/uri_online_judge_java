import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nomeVendedor;
		double salario, valorVendido,TOTAL;
		
		nomeVendedor = sc.nextLine();
		
		salario = sc.nextDouble();
		
		valorVendido = sc.nextDouble();
		
		TOTAL = (valorVendido * 0.15) + salario;
		
		System.out.printf("TOTAL = R$ %.2f%n", TOTAL);
		
		sc.close();

	}

}
