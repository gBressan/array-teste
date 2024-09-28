import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int listaNum;

        System.out.println("Digite a quantidade de números: ");

        listaNum = scanner.nextInt();

        int[] numero = new int[listaNum]; // cria um array com o indice de acordo com a variável 'listaNum'

        System.out.println("Digite os números");
        for (int i = 0; i < listaNum; i++){ // insere os numeros no array
            numero[i] = scanner.nextInt();
        }

        System.out.println("A ordem inversa dos números é: ");
        for(int i = listaNum -1; i >= 0; i--){   // essa operação faz o a variavel 'i' percorrer o array ao contrário, começando da ultima posição
            System.out.println(numero[i] + " "); // o 'i--' percorre o array para uma posção anterior
        }

        Arrays.sort(numero); // ordena o array em ordem crescente
        System.out.println("Números em sequência: ");
        for(int num : numero){                  //itera o array para podermos exiber corretamente
            System.out.println(num + " ");
        }


        scanner.close();
    }
}