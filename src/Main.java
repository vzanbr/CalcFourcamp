import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1 , numero2;
        int memoria = 0;
        char operador;

        System.out.println("Insira o operador + , - , * , /");
        operador = entrada.next().charAt(0);

        System.out.println("Insira o primeiro numero");
        numero1 = entrada.nextInt();

        System.out.println("Insira o segundo numero");
        numero2 = entrada.nextInt();


        if (operador == '+')
        {
            System.out.println("  O resultado da adição é " + (numero1 + numero2));
            memoria++;
        }
        if (operador == '-')
        {
            System.out.println("  O resultado da subtração é " + (numero1 - numero2));
            memoria++;
        }
        if (operador == '*')
        {
            System.out.println("  O resultado da multiplicação  " + (numero1 * numero2));
            memoria++;
        }
        if (operador == '/')
        {
            System.out.println("  O resultado da divisão é " + (numero1 / numero2));
            memoria++;
        }
        if (memoria == 0)
        {
            System.out.println("Opção invalida!");
        }

    }
}