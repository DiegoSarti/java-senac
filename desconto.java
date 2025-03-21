
import java.util.Scanner;
public class Desconto
{
 
public static void main(String[] args) {
 
Scanner entrada = new Scanner(System.in);
 
 
System.out.print("Olá, bom dia, digite o valor da sua compra: ");
 
Float valor = entrada.nextFloat();
 
 
// Calculando o valor com desconto
 
if (valor >= 300 ) {
 
double valorPorcentagemMaior = 15.0 / 100.0;
 
double valorMaior = valor - (valorPorcentagemMaior * valor);
 
double descontoMaior = valorPorcentagemMaior * valor; // Valor do desconto
 
System.out.printf("Valor do desconto: R$ %.2f\n", descontoMaior); // Exibe o valor do desconto
 
System.out.printf("Valor total após o desconto: R$ %.2f\n", valorMaior); // Exibe o valor final
 
} else {
 
double valorPorcentagemMenor = 10.0 / 100.0;
 
double valorMenor = valor - (valorPorcentagemMenor * valor);
 
double descontoMenor = valorPorcentagemMenor * valor; // Valor do desconto
 
System.out.printf("Valor do desconto: R$ %.2f\n", descontoMenor); // Exibe o valor do desconto
 
System.out.printf("Valor total após o desconto: R$ %.2f\n", valorMenor); // Exibe o valor final
 
}
 
 
}
}