import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner enterScanner = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Digite o primeiro numero da soma");
		a = enterScanner.nextInt();
		System.out.println("Digite o segundo numero");
		b = enterScanner.nextInt();
		int c;
		c = a + b;
		
		System.out.println("O resultado da soma é de: " + c);
		
	}

}
