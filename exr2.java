import java.util.Scanner;
public class Tabuada {
 
public static void main(String[] args) {
 
Scanner scanner = new Scanner(System.in);
 
System.out.print("Digite um número de 1 a 10: ");
 
int numero = scanner.nextInt();
 
for (int i = 1; i <= 10; i++) {
 
System.out.println(numero + " x " + i + " = " + (numero * i));
 
}
 
}
