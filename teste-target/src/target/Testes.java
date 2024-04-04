package target;

public class Testes {

    public static void teste1(){
        int INDICE = 13;
        int soma = 0;
        int k = 0;

        while (k < INDICE) {
            k++;
            soma += k;
        }

        System.out.println(soma);
    }

    public static void teste2(int num) {

        if (num == 0 || num == 1) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci!");
            return;
        }

        int anterior = 0, atual = 1, proximo;

        while (true) {
            proximo = anterior + atual;
            if (proximo > num) {
                System.out.println("O número " + num + " não pertence à sequência de Fibonacci!");
                return;
            }
            if (proximo == num) {
                System.out.println("O número " + num + " pertence à sequência de Fibonacci!");
                return;
            }
            anterior = atual;
            atual = proximo;
        }

    }

    public static void teste5(String texto) {
        char[] caracteres = texto.toCharArray();
        char[] invertido = new char[caracteres.length];

        for (int i = 0; i < caracteres.length; i++) {
            invertido[i] = caracteres[caracteres.length - 1 - i];
        }

        String resultado = new String(invertido);

        System.out.println("String invertida: " + resultado);
    }

}
