import java.util.Scanner;

public class Ex1 {

        public static void calcularDuracao(int horaDeInicio, int minutosInicio, int horaDeTermino, int minutosTermino, int[] duracaoJogo ){

            int duracaoEmHoras = horaDeTermino - horaDeInicio;   // faz o calculo das horas
            int duracaoEmMinutos = minutosInicio - minutosTermino;

            if(duracaoEmMinutos < 0){
                duracaoEmMinutos += 60;  // arruma a minutagem caso ela dê negativa
                duracaoEmHoras -= 1;
            }

            if(duracaoEmHoras < 0){
                duracaoEmHoras += 24;
            }

            duracaoJogo[0] = duracaoEmHoras;   //bota os resultados em reus respectivos indices
            duracaoJogo[1] = duracaoEmMinutos;

        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int horaDeInicio;
            int horaDeTermino;
            int minutosInicio;
            int minutosTermino;

            int[] duracaoJogo = new int[2]; // o indice '0' vai ser as horas e o '1' sera os minutos

            System.out.println("Digite a hora de início do jogo (horas/minutos)");
            horaDeInicio = scanner.nextInt();
            minutosInicio = scanner.nextInt();

            System.out.println("Digite a hora do fim do jogo (horas/minutos)");
            horaDeTermino = scanner.nextInt();
            minutosTermino = scanner.nextInt();

            calcularDuracao(horaDeInicio, minutosInicio, horaDeTermino, minutosTermino, duracaoJogo); //faz os calculos com os valores instanciados no scanner

            System.out.println("o Jogo durou: " + duracaoJogo[0] + " hora e " + duracaoJogo[1] + " minutos");
            scanner.close();
        }
    }


