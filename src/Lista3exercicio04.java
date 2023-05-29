import java.util.Scanner;

public class Lista3exercicio04 {
    public static void main(String[] args) {
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("SOMANDO NÚMEROS");
        System.out.println("...............................");
        System.out.println("Digite a quantidade de números positivos que deseja somar: ");

        double qntNum = entrada_do_usuario.nextInt();
        double n = 1;
        double soma = 0;


        while (n <= qntNum) {
            System.out.println("Digite o " + n + " número: ");
           double numero = entrada_do_usuario.nextDouble();
            soma += numero;
            n++;
        }
        System.out.println("A soma desses números é: " + soma);

    }
}
