/******************************************************************************

Implemente uma questão de múltipla escolha referente a alguma das outras
disciplinas que você está cursando neste semestre. Primeiro deverá ser apresentado
o enunciado da questão com as 5 opções/alternativas de resposta, que são (a), (b),
(c), (d) e (e). Depois que o usuário escolher uma opção, se for a resposta correta
deverá ser impresso “Resposta correta”, caso contrário “Resposta incorreta”.
Utilize a instrução switch, invés de if, na implementação.

*******************************************************************************/
import java.util.Scanner;

public class Questao
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	 System.out.println("Qual é o valor decimal do número binário 1011?");
	 System.out.println("a)- 11 ");
	 System.out.println("b)- 10");
	 System.out.println("c)- 13");
	 System.out.println("d)- 14");
	 System.out.println("e)- 9");
	 
	 System.out.println("Digite a letra da resposta correta: ");
	 String resposta = entrada.next();
	 
	 switch(resposta){
	     case "a":
	         System.out.println("Resposta correta");
	         break;
	     case "b":
	     case "c":
	     case "d":
	     case "e":
	         System.out.println("Resposta Incorreta");
	         break;
	     default:
	       System.out.println("Invalido");
	 } 
	}
}
