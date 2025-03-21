
import java.util.Scanner;
public class Main
{
 
public static void main(String[] args) {
 
Scanner entrada = new Scanner(System.in);
 
 
System.out.println("Digite um valor inteiro: ");
 
float valorin = entrada.nextFloat();
 
 
float primeiromulti = valorin * 1;
 
float segundomulti = valorin * 2;
 
float terceiromulti = valorin * 3;
 
 
System.out.println("Primeiro Multiplo: " + primeiromulti);
 
System.out.println("Segundo Multiplo: " + segundomulti);
 
System.out.println("Terceiro Multiplo: " + terceiromulti);
 
}
