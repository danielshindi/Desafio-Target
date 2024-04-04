package target;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Testes.teste1();


        System.out.println("Digite um número e verifique se ele pertence à sequência de Fibonacci: ");
        Testes.teste2(scan.nextInt());


        System.out.println("Escreva uma string: ");
        Testes.teste5(scan.next());


    }
}
