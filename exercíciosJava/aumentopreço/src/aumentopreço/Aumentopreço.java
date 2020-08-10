package aumentopreço;

import java.util.Scanner;


public class Aumentopreço {


    public static void main(String[] args) {
      //definiacao de variaveis
      double preco, result;
      String nome;
      //entrada
      Scanner
        entrada = new Scanner(System.in);
              
      System.out.println("Digite o nome do produto que deseja vender: ");
      nome=entrada.next();
      
      System.out.println("Digite o  valor que pagou nesse produto:" );
      preco=entrada.nextDouble();
      
      //processamento
      result= (preco*1.65);
      
      //saida
      System.out.println("Você poderá vender o produto: "+nome+" por R$"+result);
      
    }
    
}
