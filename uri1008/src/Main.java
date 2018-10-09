import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horasTrabalhadas, NUMBER;
		double valorHora, SALARY;
		
		NUMBER = sc.nextInt();
		
		horasTrabalhadas = sc.nextInt();
		
		valorHora = sc.nextDouble();
		
		SALARY = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + NUMBER);
		
		System.out.printf("SALARY = %.2f%n", SALARY);
		
		sc.close();

	}

}
