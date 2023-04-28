import java.util.Scanner;
import java.util.Locale;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Double raio, area;
		System.out.print("Digite o raio do circulo: ");
		raio = sc.nextDouble();
		area = 3.14159*(Math.pow(raio, 2));
		System.out.printf("%nA Area do circulo, com a area: %f = %.4f%n", raio, area);
    }
}
