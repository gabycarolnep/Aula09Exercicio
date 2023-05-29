import java.util.Scanner;

public class Lista3exercicio03 {
    public static void main(String[] args) {
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("COMPARANDO NÚMEROS");
        System.out.println("...............................");
        System.out.println("Digite a quantidade de números que desejar: ");

        int qntNum = entrada_do_usuario.nextInt();
        int n = 1;
        int menorNum = 2147483647;
        int maiorNum = -2147483648;

        while (n <= qntNum) {
            System.out.println("Digite o número " + n + " :");
            int numero = entrada_do_usuario.nextInt();

        if (numero < menorNum){
            menorNum = numero;
        }

            if (numero > maiorNum) {
                maiorNum = numero;
            }
        n++;

        }
        System.out.println("O menor número é: " + menorNum);
        System.out.println("O maior número é: " + maiorNum);
    }
}
