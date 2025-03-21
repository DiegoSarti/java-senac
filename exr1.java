
import java.util.Scanner;
public class valorDosProdutos
{
 
public static void main(String[] args) {
 
Scanner entrada = new Scanner(System.in);
 
 
System.out.println("Digite o Primeiro Valor: ");
 
Float valor1 = entrada.nextFloat();
 
 
System.out.println("Digite o Segundo Valor: ");
 
Float valor2 = entrada.nextFloat();
 
 
System.out.println("Digite o Terceiro Valor: ");
 
Float valor3 = entrada.nextFloat();
 
 
Float produto = valor1 * valor2 * valor3;
 
 
System.out.println("O produto dos valores é: " + produto);
 
}
}