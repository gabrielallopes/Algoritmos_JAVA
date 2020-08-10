
package cotacaodolar;

import java.util.Scanner;


public class Cotacaodolar {

   
    public static void main(String[] args) {
         double dolar, reais, result;
        //entrada
      Scanner entrada = new Scanner(System.in);
     
     System.out.println("Digite a cotação do dólar atual:");
     dolar= entrada.nextDouble();
     System.out.println("Digite o valor em reais que deseja converter para dólar:");
     reais= entrada.nextDouble();
    
     //processamento
    result=reais/dolar;
     
     //saida
     System.out.println("O valor convertido será: US$"+result);
     
    }
    
}
