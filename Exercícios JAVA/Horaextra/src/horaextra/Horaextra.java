
package horaextra;

import java.util.Scanner;


public class Horaextra {

    
    public static void main(String[] args) {
    double hora, minuto, tempo, salario, total, horaextra;
       
       
     //entrada
      Scanner entrada = new Scanner(System.in);
     
     System.out.println("Informe quantas horas você trabalhou(sem os minutos):");
     hora= entrada.nextDouble();
     System.out.println("Informe quantos minutos você trabalhou:");
     minuto= entrada.nextDouble();
     System.out.println("Informe quanto você recebe por hora:");
     salario= entrada.nextDouble();
  
     //processamento
     tempo=(minuto/60)+hora;
     total=salario*tempo;
     horaextra=total+(total/100)*70;
         
     //saida
     System.out.println("O valor que deverá receber de Hora Extra é: R$"+horaextra);
    

    }
    
}
