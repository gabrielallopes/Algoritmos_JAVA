package custocarro;

import java.util.Scanner;

public class Custocarro {

  
public static void main(String[] args) {
 double custofabrica,porcdistribuicao,porcimpostos,precovenda;
 
     //entrada
      Scanner entrada = new Scanner(System.in);
     
     System.out.println("Digite o valor de fábrica do automóvel:");
     custofabrica= entrada.nextDouble();
 
     //processamento
    porcimpostos=custofabrica+(custofabrica/100)*45;
    porcdistribuicao=porcimpostos+(porcimpostos/100)*28;  
    precovenda=porcdistribuicao;
     //saida
     System.out.println("O preço total ao consumidor será de: R$"+precovenda);
      
    }
    
}
