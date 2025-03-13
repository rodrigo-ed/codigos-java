
//  Calculadora simples
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;

        System.out.println("calculadora Simples");
        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextDouble();

        resultado = calcular(num1, num2, operador);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static double calcular(double num1, double num2, char operador) {
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (num2 != 0) ? num1 / num2 : Double.NaN;
            default:
                System.out.println("Operador invalido");
                return 0;
        }

    }
}
