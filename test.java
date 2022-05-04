import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double valor1, valor2;

        System.out.println("Digite o número: ");
        valor1 = sc.nextDouble();
        System.out.println("Digite outro número: ");
        valor2 = sc.nextDouble();

        sc.close();

        System.out.println("A soma de " + valor1 + " e " + valor2 + " é " + valor1+valor2);


    }
    
}