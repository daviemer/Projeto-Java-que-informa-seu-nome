import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual é o seu nome completo?\n");
        System.out.print("Nome: ");
        
        String nome = scanner.nextLine();
        scanner.close();
        
        System.out.println("Seu nome completo é " + nome);
        
    }
}