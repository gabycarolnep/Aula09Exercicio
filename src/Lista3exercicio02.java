import java.util.Scanner;

public class Lista3exercicio02 {
    public static void main(String[] args) {
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("MEDIA");
        System.out.println("...............................");
        System.out.println("Digite a quantidade de números que deseja fazer a média: ");

        int qntNum = entrada_do_usuario.nextInt();
        int soma = 0;
        int n = 1;

        while (n <= qntNum){
            System.out.println("Digite o número " + n + " :");
            double numero = entrada_do_usuario.nextDouble();
            soma += numero;
            n++;
        }
        double media = (double) soma/ qntNum;
        System.out.println("A media desses números é: " + media);




    }
}
