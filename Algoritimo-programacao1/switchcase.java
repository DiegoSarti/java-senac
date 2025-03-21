import java.util.Scanner; 

public class switchcase
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Digite o nome do aluno: ");
	    String nome = entrada.next();
	    
	     System.out.println("Digite a nota 1:  ");
	     int n1 = entrada.nextInt();
	     
	     System.out.println("Digite a nota 2:  ");
	     int n2 = entrada.nextInt();
	     
	     int media = (n1 + n2) / 2;
	     
	    System.out.println(media);
	    
	     if ((media == 9) || (media == 10))
	        System.out.println("A");
            else if(media == 8)
                System.out.println("B");
            else if(media == 7)
                System.out.println("c");
            else if(media == 6)
                System.out.println("D");
            else if(media == 6)
                System.out.println("E");
	     
	    
	    
	    
    switch(media) {
        case 'A':
            System.out.print("A");
            break;
        case 'B':
            System.out.print("B");
            break;
        case 'c':
            System.out.print("C");
             break;
        case 'D':
            System.out.print("D");
            break;
        case 'E':
            System.out.print("E");
            break;
        // default :
        //     System.out.print("E");
	}
}
}
