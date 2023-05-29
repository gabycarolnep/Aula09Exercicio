import java.util.Scanner;

public class Lista3exercio05 {
    public static void main(String[] args) {
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("SOMANDO NÚMEROS IMPARES");
        System.out.println("...............................");
        System.out.println("Digite o intervalo dos numeros inteiros que deseja somar");

        System.out.println("Primeiro número do intervalo: ");
        int num1 = entrada_do_usuario.nextInt();
        System.out.println("Último número do intervalo: ");
        int num2 = entrada_do_usuario.nextInt();
        int soma = 0;

        for (int i = num1; i < num2; i++ ){

            if ((i % 2) != 0){
                System.out.println("Esse número " + i + " é impar");
                soma += i;
            } else {
                System.out.println("Esse número " + i + " é par");
            }

            }
        System.out.println("A soma de todos os nímeros ímpares nesse intervalo é: " + soma);


    }
}
