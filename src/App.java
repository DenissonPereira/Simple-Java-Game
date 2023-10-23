import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random numero = new Random();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println(String.format("Olá, %s! Seja bem vindo ao jogo!", nome));
        System.out.println("Digite um número para escolher a dificuldade:");
        System.out.println("1 - Fácil \n2 - Médio \n3 - Difícil");
        int x = entrada.nextInt();
        if (x == 1) {
            int aleatorio = numero.nextInt(10);
            System.out.println(String.format("%s, você escolheu o nível fácil. Vamos começar! \nQual o número que estou pensando? \nDica: o número está entre 0 e 10.", nome));
            int y = entrada.nextInt();
            if (y == aleatorio) {
                System.out.println(String.format("Parabéns, %s! Você acertou o número!", nome));
            } else {
                System.out.println(String.format("Infelizmente você errou, %s. O número certo era %d.", nome, aleatorio));
            }
        } else if (x == 2) {
            int aleatorio = numero.nextInt(50);
            System.out.println(String.format("%s, você escolheu o nível médio. Vamos começar! \nQual o número que estou pensando? \nDica: o número está entre 0 e 50.", nome));
            int y = entrada.nextInt();
            if (y == aleatorio) {
                System.out.println(String.format("Parabéns, %s! Você acertou o número!", nome));
            } else {
                System.out.println(String.format("Infelizmente você errou, %s. O número correto era %d.", nome, aleatorio));
            }
        } else if (x == 3){
            int aleatorio = numero.nextInt(100);
            System.out.println(String.format("%s, você escolheu no nível difícil. Agora a coisa ficou MASSA!! \nQual o número que estou pensando? \nDica: pode ser qualquer número entre 0 e 100 :p", nome));
            int y = entrada.nextInt();
            if (y == aleatorio) {
                System.out.println(String.format("Incrível, %s! Você acertou!!!", nome));
            } else {
                System.out.println(String.format("Já sabia que você não era capaz! O número correto era %d.", aleatorio));
            }
        } else {
            System.out.println(String.format("%s, escolha o nível de dificuldade 1, 2 ou 3.", nome));
        }


        entrada.close();
    }
}
