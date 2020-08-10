
package comissaovendedor;

import java.util.Scanner;


public class Comissaovendedor {

    
    public static void main(String[] args) {
           double preuni, qtde, valorf, comissao;
       
       
     //entrada
      Scanner entrada = new Scanner(System.in);
     
     System.out.println("Solicite o preço unitário da peça:");
     preuni= entrada.nextDouble();
     System.out.println("Digite o quantidade de peças vendidas:");
     qtde= entrada.nextDouble();
  
     //processamento
    valorf=preuni*qtde;
    comissao=valorf*0.05;        
     //saida
     System.out.println("O preço de venda é: R$"+valorf);
     System.out.println("A comissão do vendedor será de: R$"+comissao);

    }
    
}
