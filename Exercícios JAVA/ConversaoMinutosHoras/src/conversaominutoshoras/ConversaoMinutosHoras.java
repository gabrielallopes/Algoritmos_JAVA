
package conversaominutoshoras;

import java.util.Scanner;


public class ConversaoMinutosHoras {

 
    public static void main(String[] args) {
        double hora, minuto, segundo;
 
     //entrada
      Scanner entrada = new Scanner(System.in);
     
     System.out.println("Digite as horas:");
     hora= entrada.nextDouble();
     System.out.println("Digite os minutos:");
     minuto= entrada.nextDouble();
 
     //processamento
   segundo=(minuto/60)+hora;
   
     //saida
     System.out.println(hora+"h "+minuto+"min "+"é igual a: "+segundo+"seg");
    }
    
}
