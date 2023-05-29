import java.util.Scanner;

public class Lista3exercicio06 {
    public static void main(String[] args) {
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("DESCOBRINDO PRIMOS");
        System.out.println("...............................");
        System.out.println("Digite um número inteiro positivo qual quer: ");

        int n = entrada_do_usuario.nextInt();
        int qntDivisor = 0;

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                qntDivisor++;
            }
        }

        if (qntDivisor == 2){
            System.out.println("Esse número é primo");
        } else {
            System.out.println("Esse número não é primo");
        }


    }
}
