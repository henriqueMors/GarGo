import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor 1: ");
        int valor1 = input.nextInt();
        System.out.print("Digite o valor 2: ");
        int valor2 = input.nextInt();
        System.out.print("Digite o valor 3: ");
        int valor3 = input.nextInt();

        System.out.println("O valor 1 digitado foi: " + valor1);
        System.out.println("O valor 2 digitado foi: " + valor2);
        System.out.println("O valor 3 digitado foi: " + valor3);

        input.close();

        System.out.println("GarGo!");

    }
}