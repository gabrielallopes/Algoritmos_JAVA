
package velocidademedia;

import java.util.Scanner;


public class Velocidademedia {

 
    public static void main(String[] args) {
               double percurso, hora, minuto, tempo, veloMedia;
       
       
     //entrada
      Scanner entrada = new Scanner(System.in);
     
     System.out.println("Digite o percurso: ");
     percurso= entrada.nextDouble();
     System.out.println("Digite as horas sem os minutos: ");
     hora= entrada.nextDouble();
     System.out.println("Digite os minutos: ");
     minuto= entrada.nextDouble();
             
     //processamento
     tempo = (minuto/60)+hora;
     veloMedia = percurso/tempo;
     
     //saida
     System.out.println("A Velocidade Média desse veículo era de: "+veloMedia+"km/h");
     
    }
    
}
