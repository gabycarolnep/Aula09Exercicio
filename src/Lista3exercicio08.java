import java.util.Scanner;

public class Lista3exercicio08 {
    public static void main(String[] args) {
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("FATORIAL");
        System.out.println("...............................");
        System.out.println("Digite um número inteiro positivo que deseja saber o fatorial: ");

        int n = entrada_do_usuario.nextInt();
        int fatorial = 0;

        for(int i = 0; i <= n; i++){

            if (i == 0 || i == 1) {
                fatorial = 1;
            } else {
                fatorial = fatorial * i;

            }
        }
        System.out.println("O fatorial do número " + n + " é: " + fatorial);
    }
}
