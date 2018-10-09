import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n = 3.14159, raio, area;
		
		raio = sc.nextDouble();
		
		area = Math.pow(raio, 2) * n;
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}

}
