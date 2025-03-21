mport java.util.Scanner;

public class ContagemCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = scanner.next();

        System.out.println("O nome '" + nome + "' tem " + nome.length() + " caracteres.");
    }
}