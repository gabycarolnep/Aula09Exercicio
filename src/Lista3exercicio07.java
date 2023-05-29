public class Lista3exercicio07 {
    public static void main(String[] args) {
        System.out.println("SOMANDO OS 50 PRIMEIROS NÚMEROS ÍMPARES");
        System.out.println(".............................................");

        int somaImpares = 0;
        int numImpar1 = 1;
        int quantNumerosImpares = 0;

        for (int i = 1; i <= 50; i++){
            somaImpares += numImpar1;
            quantNumerosImpares++;
            numImpar1 +=2;
            System.out.println(i + "° número impar: " + numImpar1);

        }

        System.out.println("A soma dos primeiros " + quantNumerosImpares + " números ímpares é: " + somaImpares);
    }
}
