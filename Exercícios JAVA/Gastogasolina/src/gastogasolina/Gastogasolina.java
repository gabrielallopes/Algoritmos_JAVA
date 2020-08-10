package gastogasolina;

import java.util.Scanner;


public class Gastogasolina {

    public static void main(String[] args) {
         double km, kmconsumo, consumo, preco, gastoida, gastoidavolta;
 
     //entrada
      Scanner entrada = new Scanner(System.in);
     
     System.out.println("Informe quantos quilômetros deseja percorrer:");
     km= entrada.nextDouble();
     System.out.println("Informe quantos quilômetros seu veículo percorre com um litro de gasolina:");
     kmconsumo= entrada.nextDouble();
     System.out.println("Informe o preço médio da gasolina:");
     preco= entrada.nextDouble();
 
     //processamento
     consumo=km/kmconsumo;
     gastoida=consumo*preco;
     gastoidavolta=gastoida*2;
  
   
     //saida
     System.out.println("Você gastará com gasolina: R$"+gastoida+ " para ida ou R$"+gastoidavolta+ " para ida e volta.");
    }
    
}
