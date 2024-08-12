import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1;  
        int tentativas = 0;
        int palpite = 0;
        
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Eu escolhi um número entre 1 e 100. Tente adivinhar!");

        while (palpite != numeroAleatorio) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior que " + palpite);
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor que " + palpite);
            } else {
                System.out.println("Parabéns! Você adivinhou o número " + numeroAleatorio + " em " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }
}
