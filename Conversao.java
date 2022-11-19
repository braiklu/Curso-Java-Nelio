package fundamentos;

public class Conversao {

	public static void main(String[] args) {

		double a = 1; // implicita
		System.out.println(a);

		float b = (float) 1.12345; // explicita usando o método de cast
		System.out.println(b);

		int c = 4;
		byte d = (byte) c; // explicita usando o método de cast
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
		
		//Java não avalia valor, analisa tipos (byte -> short -> int -> long -> float -> double);

	}
}
