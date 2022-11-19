package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu primeiro salario:");
		String num1 = entrada.nextLine().replace(",", ".");

		System.out.println("Digite seu segundo salario:");
		String num2 = entrada.nextLine().replace(",", ".");

		System.out.println("Digite seu terceiro salario:");
		String num3 = entrada.nextLine().replace(",", ".");

		double salario1 = Double.parseDouble(num1);
		double salario2 = Double.parseDouble(num2);
		double salario3 = Double.parseDouble(num3);
		
		double media = (salario1 + salario2 + salario3) / 3;

		System.out.println("A média do seus 3 salarios eh: " + media);

		entrada.close();

	}
}
