import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contagemNome = 0;
        String verificaNome;
        String resposta;


        String[] arrayNome = new String[5];

        while(contagemNome < arrayNome.length){ //deixa inserir nomes até atingir o tamanho máximo do array
            System.out.println("Digite o nome do aluno que quer inserir: ");
            arrayNome[contagemNome] = scanner.nextLine();     // pego o nome e insere no array
            contagemNome++;

            if(contagemNome < arrayNome.length){
                System.out.println("Deseja inserir um novo nome? (S/N)");
                resposta = scanner.nextLine().trim().toLowerCase();
                if(!resposta.equals("s")){
                    break;
                }
            }
        }

        System.out.println("Qual nome você deseja verificar? ");
        verificaNome = scanner.nextLine();

        boolean encontrado = false;

        for(int i = 0; i < contagemNome; i++) {
            if (arrayNome[i].toLowerCase().contains(verificaNome.toLowerCase())) {
                System.out.println("O nome " + arrayNome[i] + " esta no índice: " + i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("O nome não esta na lista");
        }


        scanner.close();
    }
}
